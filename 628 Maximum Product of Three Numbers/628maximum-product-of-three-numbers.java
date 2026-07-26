class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        if(n<3)return -1;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
    }
}
/*

Two ways to achieve maximum product : 
1) Either get the three largest
or 
2) Two smallest one largest. 
*/