class Solution {
    public void makePow2(int[] dp,int hi){
        int n=0;
        while(Math.pow(2,n)<=hi){
            dp[(int)Math.pow(2,n)]=n;
            n++;
        }
    }


    public int compute(int n,int[] dp,int hi){
        int count=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                if(n<=hi && dp[n]!=-1){
                    return count+dp[n];
                }
            }
            else{
                n=3*n+1;
            }
            count++;
        }
        return count;
    }

    public int getKth(int lo, int hi, int k) {
        int[] dp=new int[hi+1]; Arrays.fill(dp,-1);
        dp[0]=0;dp[1]=0;
        TreeMap<Integer,TreeSet<Integer>> tm=new TreeMap<>();
        makePow2(dp,hi);

        while(lo<=hi){
            int val=compute(lo,dp,hi);
            TreeSet<Integer> temp=tm.getOrDefault(val,new TreeSet<>());
            temp.add(lo);
            tm.put(val,temp);
            lo++;
        }

        for(int key:tm.keySet()){
            for(int a:tm.get(key)){
                if(k==1)return a;
                k--;
            }
        }
        return -1;
    }
}