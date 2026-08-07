class Solution {

    public int compute(int start,int[] dp,int[] arr){
        if(start<0 || start>=arr.length)return 0;
        if(arr[start]==0)return 1;
        if(dp[start]!=-1)return dp[start];

        dp[start]=0;
        int left=compute(start-arr[start],dp,arr);
        int right=compute(start+arr[start],dp,arr);

        dp[start]=(left==1 || right==1)?1:0;
        return dp[start];
    }

    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        if(n==1)return arr[0]==0?true:false;

        int max=Integer.MIN_VALUE;
        for(int k:arr)max=Math.max(max,k);

        int[] dp=new int[n+max+1];
        Arrays.fill(dp,-1);

        dp[start]=compute(start,dp,arr);
        return dp[start]==1?true:false;
    }
}