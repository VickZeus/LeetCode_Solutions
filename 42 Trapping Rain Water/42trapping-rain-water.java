class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int[] L=new int[n];
        int[] R=new int[n];

        L[0]=height[0];
        R[n-1]=height[n-1];

        for(int i=1;i<n;i++)L[i]=Math.max(L[i-1],height[i]); // Highest one in the left
        for(int j=n-2;j>-1;j--)R[j]=Math.max(R[j+1],height[j]); // Highest one in the right

        int tsum=0;
        for(int i=0;i<n;i++){
            tsum+=Math.min(L[i],R[i])-height[i];
        }
        return tsum;
    }
}