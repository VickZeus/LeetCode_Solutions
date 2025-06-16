class Solution 
{
    public int maximumDifference(int[] nums) //Brute Force Approach  
    {
        int maxD=-1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])maxD=(maxD<nums[j]-nums[i])?nums[j]-nums[i]:maxD;
            }
        }
        return maxD;
    }
}