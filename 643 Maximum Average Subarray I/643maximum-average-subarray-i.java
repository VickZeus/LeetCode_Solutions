class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0,end=k-1;
        double sum=0;
        for(int i=0;i<=end;i++)sum+=nums[i];
        double mav=sum/k;
        while(end<nums.length-1)
        {
            sum=sum-nums[start++]+nums[++end];
            mav=Math.max(mav,sum/k);
        }
        return mav;
    }
}