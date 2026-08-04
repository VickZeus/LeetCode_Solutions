class Solution {
    int[] dp;
    public int compute(int n){
        if(n<4)return n;
        if(dp[n]!=Integer.MAX_VALUE)return dp[n]; 

        for(int i=1;i*i<=n;i++){
            dp[n]=Math.min(dp[n],1+compute(n-i*i));
        }
        return dp[n];
    }

    public int numSquares(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        return compute(n);
    }
}