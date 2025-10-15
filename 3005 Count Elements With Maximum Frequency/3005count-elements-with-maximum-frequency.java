class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        int maxF=-1;
        int count=0;

        for(int k:nums){ //update the hashmap
            obj.put(k,1+obj.getOrDefault(k,0));
            maxF=Math.max(maxF,obj.get(k));
        }

        for(int k:nums){
            if(maxF==obj.get(k))count++;
        }

        return count;
    }
}