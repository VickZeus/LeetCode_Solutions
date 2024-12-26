class Solution 
{
    int totalways=0;  
    public int findTargetSumWays(int[] nums, int target) 
    {
        ways(nums,0,0,target);
        return totalways;
    }

    public void ways(int[] num,int index,int sum,int target)
    {
        if(index==num.length)
        {
            if(sum==target)totalways++;
        }
        else
        {
            ways(num,index+1,sum+num[index],target);
            ways(num,index+1,sum-num[index],target);
        }
    }


}