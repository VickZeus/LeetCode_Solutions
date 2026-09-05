class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1){
            if(nums[0]-nums[0]<=k)return 0;
            return -1;
        }
        
        int n=nums.length;
        
        int[] preMax=new int[n];
        int[] suffMin=new int[n];

        suffMin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffMin[i]=Math.min(suffMin[i+1],nums[i]);
        }

        preMax[0]=nums[0];
        if (preMax[0] - suffMin[0] <= k) return 0;
        for(int i=1;i<n;i++){
            preMax[i]=Math.max(preMax[i-1],nums[i]);
            if(preMax[i]-suffMin[i]<=k)return i;
        }
        return -1;
    }
}