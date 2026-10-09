class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length,maxD=Integer.MIN_VALUE;
        if(n<2)return 0;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums)pq.add(i);

        for(int i=0;i<n;i++){
            nums[i]=pq.poll();
            if(i-1>-1){
                maxD=Math.max(maxD,nums[i]-nums[i-1]);
            }
        }

        return maxD;
    }
}