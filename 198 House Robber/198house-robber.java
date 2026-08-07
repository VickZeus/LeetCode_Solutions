class Solution {

    public int compute(int n,int[] dp,int[] nums){
        if(n==0)return nums[0];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];

        int rob=nums[n]+compute(n-2,dp,nums);
        int skip=compute(n-1,dp,nums);

        dp[n]=Math.max(rob,skip);

        return dp[n];
    }

    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];Arrays.fill(dp,-1);
        return compute(n-1,dp,nums);
    }
}