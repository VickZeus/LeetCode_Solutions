class Solution {
    public int count=0,max=0;

    public void dfs(int[] nums,int index,int curr){
        if(index==nums.length){
            if(curr==max)count++;
            return; 
        }
        dfs(nums,index+1,curr|nums[index]);
        dfs(nums,index+1,curr);
    }
    public int countMaxOrSubsets(int[] nums) 
    {
        for(int i:nums){
            max|=i;
        }    
        dfs(nums,0,0);
        return count;
    }
}