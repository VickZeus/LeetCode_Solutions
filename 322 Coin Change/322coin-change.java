class Solution {
    public int compute(int n,int[] coins,int[] dp){
        if(n<0) return Integer.MAX_VALUE;
        if(dp[n]!=-1)return dp[n];

        int ans=Integer.MAX_VALUE;
        for(int k:coins){
            int val=compute(n-k,coins,dp);
            if(val!=Integer.MAX_VALUE)ans=Math.min(ans,1+val);
        }
        return dp[n]=ans;
    }

    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        int val=compute(amount,coins,dp);
        return val==Integer.MAX_VALUE?-1:val;
    }
}