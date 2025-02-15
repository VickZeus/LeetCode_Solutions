class Solution 
{
    public int sumOfGoodNumbers(int[] nums, int k) 
    {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
           if(i-k<0 && i+k>=nums.length)
           {
               sum+=nums[i];
               continue;
           }
           else if(i-k<0 && nums[i]>nums[i+k])
           {
               sum+=nums[i];continue;
           }
           else if(i+k>=nums.length && nums[i]>nums[i-k])
           {
                sum+=nums[i];continue;
           }
           else if(i+k<nums.length && i-k>=0 && nums[i]>nums[i+k] && nums[i]>nums[i-k])
           {
               sum+=nums[i];continue;
           }
        }
        return sum; 
    }
}