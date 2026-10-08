class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=Math.abs(nums[i]);
            if(nums[temp-1]<0){ // if seen twice
                ans.add(temp);
            }
            else{
                nums[temp-1]=-nums[temp-1]; // seen first time
            }
        }
        return ans;
    }
}