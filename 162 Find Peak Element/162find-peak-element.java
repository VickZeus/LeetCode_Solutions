class Solution {
    public int getAns(int nums[],int left,int right){
        if(nums.length==1)return 0;
        
        if(left==0 && nums[left+1]<nums[left])return left;
        if(right==nums.length-1 && nums[right-1]<nums[right])return right;

        if(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1])return mid;
            int l=getAns(nums,mid+1,right);
            int r=getAns(nums,left,mid);

            if(l>-1)return l;
            if(r>-1)return r;
        }
        return -1;
    }
    public int findPeakElement(int[] nums) {
        return getAns(nums,0,nums.length-1);
    }
}