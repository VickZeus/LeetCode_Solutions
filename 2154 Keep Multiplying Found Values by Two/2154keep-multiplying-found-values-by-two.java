class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> k=new HashSet<>();
        for(int i:nums)k.add(i);

        while(k.contains(original)){
            original*=2;
        }

        return original;
    }
}