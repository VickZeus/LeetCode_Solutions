class Solution {

    public int BS(int[] nums,int target,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                return BS(nums,target,mid+1,right);
            }
            if(nums[mid]>target){
                return BS(nums,target,left,mid);
            }
            return mid;
        }
        return right;
    }   

    public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1])return nums.length;
        return BS(nums,target,0,nums.length-1);
    }
}