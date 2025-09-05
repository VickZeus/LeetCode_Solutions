class Solution {

    public int sieve(int n){
        boolean[] status=new boolean[n+1];
        for(int i=2;i<n+1;i++)status[i]=true;

        for(int i=2;i*i<=n;i++){
            if(status[i]){
                for(int j=i*i;j<=n;j=j+i){
                    status[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(status[i])count++;
        }
        return count;
    }

    public int countPrimes(int n) {
        return sieve(n-1);
    }
}