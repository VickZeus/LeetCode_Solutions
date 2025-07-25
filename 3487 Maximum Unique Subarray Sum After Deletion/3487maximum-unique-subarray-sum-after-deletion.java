class Solution 
{
    public int sum(HashSet<Integer> obj)
    {
        int sum=0;
        for(int k:obj)sum+=k;
        return sum;
    }

    public int minN(int[] obj)
    {
        int max=Integer.MIN_VALUE;
        for(int i:obj)if(i>max)max=i;
        return max;
    }

    public int maxSum(int[] nums) 
    {
        if(nums.length==1)return nums[0];
        int sum=0;
        HashSet<Integer> obj=new HashSet<>();
        for(int i:nums)
        {
            if(i>0)obj.add(i);
        }    
        if(obj.size()==0)return minN(nums);
        return sum(obj);
    }
}