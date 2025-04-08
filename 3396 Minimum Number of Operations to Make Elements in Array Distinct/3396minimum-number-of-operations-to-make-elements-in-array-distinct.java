class Solution 
{
    public int minimumOperations(int[] nums) //Brute Force Approach
    {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int k:nums)
        {
            if(obj.getOrDefault(k,0)==0)
            {
                obj.put(k,1);
            }
            else 
            {
                obj.put(k,obj.get(k)+1);
            }
        }

        int j=0;
        boolean flag=true;
        int count=0;
        while(flag && j<nums.length)
        {
            int sum=0;
            for(int i=j;i<nums.length;i++)
            {
                sum+=obj.get(nums[i]);
                if(obj.get(nums[i])!=1)break;
                if(sum==nums.length-j)flag=false;

            }
            if(flag)count++;
            j+=3;
            if(j<nums.length)
            {
            obj.put(nums[j-1],obj.get(nums[j-1])-1);
            obj.put(nums[j-2],obj.get(nums[j-2])-1);
            obj.put(nums[j-3],obj.get(nums[j-3])-1);
            }
        }
        return count;
    }
}