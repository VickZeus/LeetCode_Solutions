class Solution 
{
    public int abs(int n)
    {
        if(n<0)return -n;
        return n;
    }
    public int maxAdjacentDistance(int[] nums) 
    {
        int diff=abs(nums[nums.length-1]-nums[0]);

        for(int i=0;i<nums.length-1;i++)
        {
            int k=abs(nums[i]-nums[i+1]);
            if(diff<k)diff=k;
        }    
        return diff;
    }
}