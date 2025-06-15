class Solution 
{
    public int n=1;
    public void calc(int[] nums,int curr)
    {
        if(curr+nums[curr]>=n)n=curr;
        if(curr-1>=0)calc(nums,curr-1);
    }
    public boolean canJump(int[] nums) 
    {
        if(nums.length==1)return true;
        if(nums[0]==0)return false;
        n=nums.length-1;
        calc(nums,nums.length-1);
        if(n==0)return true;
        return false;
    }
}