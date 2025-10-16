class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close=0;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=nums.length-1;i>0;i--){
            int j=0,k=i-1;
            while(j<k){
                int sum=nums[j]+nums[k]+nums[i];
                if(Math.abs(target-sum)<diff){
                    diff=Math.abs(target-sum);
                    close=sum;
                }
                if(sum>=target)k--;
                if(sum<target)j++;
            }
        }
        return close;
    }
}