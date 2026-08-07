class Solution {

    public int compute(int n,int[] dp){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];

        dp[n]=compute(n-1,dp)+compute(n-2,dp);
        return dp[n];
    }

    public int climbStairs(int n) {
        if(n<=3)return n;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;dp[1]=1;dp[2]=2;dp[3]=3;

        dp[n]=compute(n,dp);
        return dp[n];
    }
}