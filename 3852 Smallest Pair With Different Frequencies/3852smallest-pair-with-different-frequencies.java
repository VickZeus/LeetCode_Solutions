class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int[] ans=new int[2];
        Arrays.sort(nums);
        ans[0]=-1;ans[1]=-1;
        if(nums.length==1)return ans;

        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i:nums){
            int curr=freq.getOrDefault(i,0);
            freq.put(i,curr+1);
        }

        for(int i=0;i<nums.length-1;i++){
            int temp=-1;
            for(int j=i+1;j<nums.length;j++){
                if(freq.get(nums[j])!=freq.get(nums[i]) && nums[j]!=nums[i]){
                        temp=nums[j];break;
                }
            }
            if(temp!=-1){
                ans[0]=nums[i];
                ans[1]=temp;
                return ans;
            }
        }
        return ans;
    }
}