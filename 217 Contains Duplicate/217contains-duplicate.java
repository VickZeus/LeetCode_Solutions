class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> obj=new HashSet<>();
        for(int i:nums){
            if(!obj.contains(i)){
                obj.add(i);continue;
            }
            if(obj.contains(i))return true;
        }
        return false;
    }
}