class Solution {
    public void compute(int n,int[] dp,int[] dp2,int[] nums){
        if(n<0 || dp[n]!=Integer.MIN_VALUE)return;

        compute(n-1,dp,dp2,nums);
        dp[n]=Math.max(
            nums[n],Math.max(
                dp[n-1]*nums[n],
                dp2[n-1]*nums[n]
            )
        );

        dp2[n]=Math.min(
            nums[n],
            Math.min(
                dp[n-1]*nums[n],
                dp2[n-1]*nums[n]
            )
        );


    }

    public int maxProduct(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[] dp=new int[n+1]; //stores the max product at n
        int[] dp2=new int[n+1];//stores the min product at n

        Arrays.fill(dp,Integer.MIN_VALUE);dp[0]=nums[0];
        Arrays.fill(dp2,Integer.MAX_VALUE);dp2[0]=nums[0];

        int ans=0;compute(n-1,dp,dp2,nums);
        for(int i=0;i<n;i++)ans=Math.max(ans,dp[i]);
        return ans;
    }
}