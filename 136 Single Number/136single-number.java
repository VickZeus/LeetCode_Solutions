class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i:nums)obj.put(i,obj.getOrDefault(i,0)+1);
        for(int i:nums){
            if(obj.get(i)==1)return i;
        }
        return -1;
    }
}