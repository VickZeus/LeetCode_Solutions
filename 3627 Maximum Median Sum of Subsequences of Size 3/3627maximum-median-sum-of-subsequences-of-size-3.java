class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        long sum=0;
        while(left<right){
            sum+=nums[--right];
            --right;++left;
        }

        return sum;
        
    }
}