class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int minS=Integer.MAX_VALUE,totSum=0,left=0,n=nums.length;
        for(int right=0;right<n;right++){
            totSum+=nums[right];
            while(left<n && totSum>=target){
                totSum=totSum-nums[left];
                minS=Math.min(minS,right-left+1);
                left++;
            }
        }
        if(minS==Integer.MAX_VALUE)return 0;
        return minS;
    }
}