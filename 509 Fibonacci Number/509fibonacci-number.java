class Solution {

    int[] dp;
    public int compute(int n){
        if(n<=1)return n;
        if(dp[n]!=0)return dp[n];
        dp[n]=compute(n-1)+compute(n-2);
        return dp[n];
    }
    public int fib(int n) {
        dp=new int[n+1];
        return compute(n);
    }
}