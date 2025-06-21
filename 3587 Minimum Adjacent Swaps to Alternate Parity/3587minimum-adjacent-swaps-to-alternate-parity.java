class Solution 
{
    public int eve=0,odd=0;
    public boolean isValid(int[] nums)
    {

        for(int i:nums)
        {
            if(i%2==0)eve++;
            if(i%2!=0)odd++;
        }

        if((eve==odd) || (eve==odd+1) || (odd==eve+1))return true;
        return false;
    }

    public int calcE(int[] nums)
    {
        int k=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
               sum+=Math.abs(i-2*k);k++;
            }
        }
        return sum;
    }

    public int calcO(int[] nums)
    {
        int k=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
               sum+=Math.abs(i-2*k);k++;
            }
        }
        return sum;
    }

    
    public int minSwaps(int[] nums) 
    {
        if(!isValid(nums))return -1;

        if(eve>odd)
        {
            return calcE(nums);
        }
        else if(odd>eve)
        {
            return calcO(nums);

        }
        else 
        {
            return Math.min(calcE(nums),calcO(nums));
        }
    }
}