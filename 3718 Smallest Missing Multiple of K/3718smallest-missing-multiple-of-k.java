class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> obj=new HashSet<>();
        for(int i:nums)obj.add(i);
        int i=1;
        for(;i<=nums.length;i++){
            if(!obj.contains(i*k))return i*k;
        }
        return k*i;
    }
}