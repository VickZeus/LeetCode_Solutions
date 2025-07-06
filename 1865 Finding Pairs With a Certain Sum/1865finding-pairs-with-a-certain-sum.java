class FindSumPairs {
    int[] arr1;
    int[] arr2;
    HashMap<Integer,Integer> obj;

    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1=nums1;
        arr2=nums2;
        obj=new HashMap<>();

        for(int k:nums2)
        {
            obj.put(k,obj.getOrDefault(k,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int k=obj.getOrDefault(arr2[index],0);
        if(k==0)
        {
            obj.remove(arr2[index]);
        }
        else 
        {
            obj.put(arr2[index],k-1);
        }
        arr2[index]+=val;
        obj.put(arr2[index],obj.getOrDefault(arr2[index],0)+1);
    }
    
    public int count(int tot) {
        int count=0;
        for(int i:arr1)
        {
            if(obj.getOrDefault(tot-i,0)!=0)
            {
                count+=obj.get(tot-i);
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */