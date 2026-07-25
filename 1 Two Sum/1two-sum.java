class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans=new int[2];

        for(int i=0;i<nums.length;i++)hm.put(nums[i],i);

        for(int i=0;i<nums.length;i++){
            int j=hm.getOrDefault(target-nums[i],-1);
            if(j!=-1 && i!=j){
                ans[0]=i;
                ans[1]=hm.get(target-nums[i]);
                break;
            }
        }
        return ans;
    }
}