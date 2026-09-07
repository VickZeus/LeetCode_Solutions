class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;

        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] ans=new int[n1];

        for(int i=0;i<n2;i++){
            int j=i;
            while(j<n2){
                if(nums2[j]>nums2[i]){hm.put(nums2[i],nums2[j]);break;}
                j++;
            }
        }
        for(int i=0;i<n1;i++)ans[i]=hm.getOrDefault(nums1[i],-1);
        return ans;
    }
}