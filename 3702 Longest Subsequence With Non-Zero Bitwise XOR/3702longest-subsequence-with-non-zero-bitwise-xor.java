class Solution {
    public int longestSubsequence(int[] nums) {
        int count=0;
        for(int i:nums){
            if(i==0)count++;
        }

        if(count==nums.length)return 0;
        count=0;
        int xor=0;
        for(int i:nums){
            xor=xor^i;
        }
        if(xor==0)return nums.length-1;
        return nums.length;
    }
}