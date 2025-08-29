class Solution {
    public int BS(int[] nums,int target,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target)return mid;
            if(nums[mid]>target){
                return BS(nums,target,left,mid);
            }
            else{
                return BS(nums,target,mid+1,right);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return BS(nums,target,0,nums.length);
    }
}