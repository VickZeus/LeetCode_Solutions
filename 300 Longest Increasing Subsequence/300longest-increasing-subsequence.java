class Solution {
    public int compute(int n,int[] nums,int[] dp){
        if(n<0)return 0;
        if(dp[n]!=Integer.MIN_VALUE)return dp[n];

        dp[n]=1;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[n])dp[n]=Math.max(dp[n],1+compute(i,nums,dp));
        }
        return dp[n];
    }

    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1]; 
        Arrays.fill(dp,Integer.MIN_VALUE);dp[0]=1;
        int ans=0;
        for(int i=0;i<n;i++)ans=Math.max(ans,compute(i,nums,dp));
        return ans;
    }
}