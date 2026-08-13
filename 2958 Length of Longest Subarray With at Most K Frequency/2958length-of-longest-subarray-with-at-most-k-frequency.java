class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length,longest=0;
        int j=0;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);    
            while(j<n && hm.getOrDefault(nums[i],0)>k){
                hm.put(nums[j],hm.getOrDefault(nums[j],0)-1);
                j++;
            }
            longest=Math.max(longest,i-j+1);
        }
        return longest;
    }
}