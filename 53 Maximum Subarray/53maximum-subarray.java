class Solution 
{
    public int maxSubArray(int[] nums) //Kadane's Algortihm
    {
        int sum=0,maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            maxsum=(maxsum>sum)?maxsum:sum;
            if(sum<0)sum=0;
        }

        return maxsum;
    }
}