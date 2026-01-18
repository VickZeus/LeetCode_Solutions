class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int totSum=0;

        obj.put(0,-1);
        for(int i=0;i<nums.length;i++){
            totSum+=nums[i];
            int rem=totSum%k;
            if(obj.getOrDefault(rem,-2)==-2){
                obj.put(rem,i);
                continue;
            }

            int remV=obj.getOrDefault(rem,-1);
            if(i-remV>=2)return true;
        }
        return false;
    }
}