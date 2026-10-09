class Solution {
    public int minimumDeletions(int[] nums) {
        int minI=-1,maxI=-1,minV=Integer.MAX_VALUE,maxV=Integer.MIN_VALUE,n=nums.length;
        if(n==1)return 1;
        for(int i=0;i<n;i++){
            if(nums[i]<minV){minI=i;minV=nums[i];}
            if(nums[i]>maxV){maxI=i;maxV=nums[i];}
        }

        // 4 cases -> both from left, both from right , one left one right , one right one left
        

        // both from left case
        int ll=Math.max(minI+1,maxI+1);
        
        // both from right case
        int rr=Math.max(n-minI,n-maxI);

        //one left or one right
        int lr=(minI+1)+(n-maxI); 
        int rl=(n-minI)+(maxI+1);     

        return Math.min(ll,Math.min(rr,Math.min(lr,rl)));
    }
}