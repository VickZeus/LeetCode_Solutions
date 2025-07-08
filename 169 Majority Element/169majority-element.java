class Solution {
    public int majorityElement(int[] nums)
    {
        int n=nums.length;
        Arrays.sort(nums);

        int max=-1;
        int count=1;

        System.out.println(Arrays.toString(nums)); 
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else 
            {
                count=1;
            }
            if(count>n/2)return nums[i];
        }
        return nums[0]; 
    }
}