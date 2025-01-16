class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) 
    {
        int answer1=0;
        int answer2=0;

        if(nums2.length%2==0)
        {
            answer1=0;
        }
        else
        {
            answer1=nums1[0];
            for(int i=1;i<nums1.length;i++)answer1^=nums1[i];
        }


        if(nums1.length%2==0)
        {
            answer2=0;
        }
        else
        {
            answer2=nums2[0];
            for(int i=1;i<nums2.length;i++)answer2^=nums2[i];
        }

        return answer1^answer2;  
    }
}