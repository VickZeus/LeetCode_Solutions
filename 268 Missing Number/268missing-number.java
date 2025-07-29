class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer>obj=new HashSet<>();
        for(int i:nums)obj.add(i);

        for(int i=0;i<nums.length;i++){
            if(!obj.contains(i))return i;
        }
        return nums.length;
    }
}