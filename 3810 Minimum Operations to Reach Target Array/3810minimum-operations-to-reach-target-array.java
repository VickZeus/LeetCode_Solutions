class Solution {
    public int minOperations(int[] nums, int[] target) {
        HashMap<Integer,Boolean> obj=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            boolean val=obj.getOrDefault(nums[i],true);
            if(nums[i]!=target[i])val=false;
            obj.put(nums[i],val);
        }

        int count=0;
        for(int key:obj.keySet()){
            if(!obj.get(key))count++;
        }
        return count;
    }
}