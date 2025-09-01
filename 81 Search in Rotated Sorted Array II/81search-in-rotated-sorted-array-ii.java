class Solution {
    // public int getIndex(int[] nums,int left,int right){
    //     if(left==right)return left;
    //     int mid=(left+right)/2;
    //     if(mid>0 && mid<nums.length-1){
    //         if(nums[mid]<nums[mid+1] && nums[mid]<nums[mid-1])return mid;
    //     }

    //     if(mid>0 && nums[mid-1]<nums[mid])return getIndex(nums,left,mid-1);
    //     return getIndex(nums,mid+1,right);
    // }

    public int getIndex(int[] nums){
        int i=0;
        while(i+1<nums.length && nums[i]<=nums[i+1]){
            i++;
        }
        return i;
    }

    public boolean findT(int[] nums,int target,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target)return true;
            if(nums[mid]<target)return findT(nums,target,mid+1,right);
            if(nums[mid]>target)return findT(nums,target,left,mid);
        }
        return false;
    }

    public boolean search(int[] nums, int target) {
        int n=nums.length;

        if(n==1 && nums[0]==target)return true;
        if(n==1 && nums[0]!=target)return false;

        int index=getIndex(nums);

        int l1=0,r1=index;
        int l2=index,r2=n;

        // while(r1>0 && nums[r1]==nums[index])r1--;
        System.out.println(r1);
        return findT(nums,target,l1,r1+1)|findT(nums,target,l2,r2);
    }
}