class Solution {

    public int compute(int a,int n,int[] dp,int[] nums){
        if(a>=n)return 0;
        if(dp[a]!=-1)return dp[a];

        int skip=compute(a+1,n,dp,nums);
        int add=compute(a+2,n,dp,nums)+nums[a];

        dp[a]=Math.max(skip,add);
        return dp[a];
    }

    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
        int case1=compute(0,n-1,dp,nums);
        Arrays.fill(dp,-1);
        int case2=compute(1,n,dp,nums);

        dp[n]=Math.max(case1,case2);
        return dp[n];
    }
}