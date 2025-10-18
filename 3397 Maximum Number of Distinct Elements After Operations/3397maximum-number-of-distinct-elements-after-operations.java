class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int c=0;

        int curr=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            int start=nums[i]-k;
            int end=nums[i]+k;

            int pick=Math.max(curr+1,start);
            if(pick<=end){
                c++;
                curr=pick;
            }
        }
        return c;
    }
}