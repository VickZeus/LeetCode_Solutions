class Solution 
{
    public int maxAscendingSum(int[] nums) 
    {
        int sum=0;

        int x=nums[0];
        int sum2=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(x<nums[i])
            {
                sum2+=nums[i];
                x=nums[i];
            }
            else if(x>=nums[i])
            {
                x=nums[i];
                sum=(sum>sum2)?sum:sum2;
                sum2=x;
            }
        }
        sum=(sum>sum2)?sum:sum2;
        return sum;    
    }
}