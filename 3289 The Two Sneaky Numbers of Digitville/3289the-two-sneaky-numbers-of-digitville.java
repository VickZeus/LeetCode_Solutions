class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int[] ans=new int[2];
        int k=0;

        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                ans[k++]=nums[i];
            }
            hs.add(nums[i]);
        }
        return ans;
    }
}