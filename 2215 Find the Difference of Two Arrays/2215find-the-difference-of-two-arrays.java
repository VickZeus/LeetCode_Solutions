class Solution {
    public List<Integer> findList(int[] nums1,int[] nums2){
        HashMap<Integer,Boolean> obj=new HashMap<>();
        List<Integer> h=new ArrayList<>();
        //Removing and Adding the nums1 and not in nums2
        for(int i:nums1){
            if(obj.getOrDefault(i,false)==false)obj.put(i,true);
        }
        for(int j:nums2){
            if(obj.getOrDefault(j,false)==true)obj.put(j,false);
        }
        for(int key:obj.keySet()){
            if(obj.get(key))h.add(key);
        }
        return h;
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> k=new ArrayList<>();
        k.add(findList(nums1,nums2));
        k.add(findList(nums2,nums1));
        return k;
    }
}