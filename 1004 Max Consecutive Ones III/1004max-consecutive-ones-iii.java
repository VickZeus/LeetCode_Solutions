class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxl=0;
        int start=0,end=0;

        for(;end<nums.length;end++){
            if(nums[end]==0){
                k--;
            }
            if(k<0){
                while(k<0){
                    if(nums[start]==0)k++;
                    start++;
                }
            }

            maxl=Math.max(maxl,end-start+1);
        }
        return maxl;
    }
}