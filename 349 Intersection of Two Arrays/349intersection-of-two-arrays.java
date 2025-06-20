class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> ans1=new HashSet<>();
        HashSet<Integer> ans2=new HashSet<>();

        for(int k:nums1)ans1.add(k);

        for(int j:nums2){
            if(ans1.contains(j))ans2.add(j);
        }    

        int[] ans=new int[ans2.size()];
        int index=0;
        for(int h:ans2){
            ans[index++]=h;
        }
        return ans;
    }
}