class Solution {

    public int getNum(int n){
        int s=Integer.MAX_VALUE,l=Integer.MIN_VALUE;
        while(n>0){
            int rem=n%10;
            s=Math.min(s,rem);l=Math.max(l,rem);
            n=n/10;
        }
        return l-s;
    }
    
    public int maxDigitRange(int[] nums) {
        int[] ans=new int[10];

        for(int k:nums){
            int val=getNum(k);
            ans[val]+=k;
        }

        for(int i=9;i>-1;i--){
            if(ans[i]!=0)return ans[i];
        }
        return -1;
    }
}