class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        if(n==1)return 0;
        Arrays.sort(nums);
        int left=0,right;
        int maxW=Integer.MIN_VALUE;

        for(right=0;right<n;right++){
            while(left<n && (long)nums[right]>(long)k*nums[left])left++;
            maxW=Math.max(maxW,right-left+1);
        }
        return n-maxW;
    }
}