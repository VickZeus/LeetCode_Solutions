class NumArray {
    int[] nums;int[] pnums;
    public NumArray(int[] nums) {
        this.nums=nums;
        pnums=new int[nums.length];
        pnums[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pnums[i]=pnums[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return pnums[right]-pnums[left]+nums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */