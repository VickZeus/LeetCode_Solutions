class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0)return false;
        int grp=nums.length/k;
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i:nums){
            obj.put(i,obj.getOrDefault(i,0)+1);
            if(obj.getOrDefault(i,0)>grp)return false;
        }
        return true;
    }
}