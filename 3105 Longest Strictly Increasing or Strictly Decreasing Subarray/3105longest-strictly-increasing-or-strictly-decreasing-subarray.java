class Solution 
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        if(nums.length==1)return 1;
        int answer=0;

        for(int i=0;i<nums.length-1;i++)
        {
            int countin=1,countdec=1;
            int valin=nums[i],valdec=nums[i];

            boolean bin=true,bdec=true;
            for(int j=i+1;j<nums.length;j++)
            {
                if(bin && nums[j]>valin)
                {
                    countin++;
                    valin=nums[j];
                }
                else
                {
                    bin=false;
                }

                if(bdec && nums[j]<valdec)
                {
                    countdec++;
                    valdec=nums[j];
                }
                else 
                {
                    bdec=false;
                }

                if(!bin && !bdec)break;
            }
            answer=Math.max(answer,Math.max(countdec,countin));
        }
        return answer;
    }
}