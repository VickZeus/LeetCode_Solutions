class Solution 
{
    public boolean check(int[] nums) 
    {
        int index=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                index=i+1;break;
            }
        }

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[(index+1)%nums.length]<nums[index%nums.length])return false;
            index++;
        }
        return true;
    
    }
}