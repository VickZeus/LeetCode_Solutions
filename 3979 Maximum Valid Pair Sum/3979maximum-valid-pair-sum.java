class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n=nums.length,maxN=Integer.MIN_VALUE;

        int[] maxV=new int[n];

        maxV[n-1]=nums[n-1];
        for(int i=n-2;i>-1;i--)maxV[i]=Math.max(maxV[i+1],nums[i]);
        for(int i=0;i<n-k;i++)maxN=Math.max(maxN,nums[i]+maxV[i+k]);

        return maxN;
    }
}