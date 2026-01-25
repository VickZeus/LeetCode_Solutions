class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length==1)return 0;

        int minDiff=Integer.MAX_VALUE,n=nums.length;
        for(int i=0;i+k-1<n;i++){
            minDiff=Math.min(nums[i+k-1]-nums[i],minDiff);
        }
        return minDiff;
    }
}