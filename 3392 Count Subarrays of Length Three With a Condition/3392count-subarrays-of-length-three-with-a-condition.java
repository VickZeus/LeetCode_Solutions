class Solution 
{
    public int countSubarrays(int[] nums) 
    {
        int count=0;
        int start=0;
        while(start<nums.length-2)
        {
            if(nums[(2*start+2)/2]==2*(nums[start]+nums[start+2]))count++;
            start++;
        }   
        return count;
    }
}