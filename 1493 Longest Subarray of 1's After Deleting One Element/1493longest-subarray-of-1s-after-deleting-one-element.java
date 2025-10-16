class Solution {
    public int longestSubarray(int[] nums) {
        int max=0,prev=0,curr=0;
        int count=0;
        for(int i:nums)count+=i;
        if(count==nums.length)return count-1;
        

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,curr+prev);
                prev=curr;
                curr=0;
            }
            else{
                curr+=1;
            }
        }
        max=Math.max(max,curr+prev);
        return max;
    }
}