class Solution 
{
    public int maxMoves(int[][] grid) 
    {
        int row=grid.length;
        int col=grid[0].length;
        int max=0;

        int dp[][]=new int[grid.length][grid[0].length];
        for(int[]arr:dp)Arrays.fill(arr,-1);

        for(int i=0;i<row;i++)
        {
            max=Math.max(max,finder(grid,i,0,dp));
        }  
        return max;
    }

    public int finder(int arr[][],int i,int j,int[][]dp)
    {
        int row=arr.length;
        int col=arr[0].length;
        if(i==row-1 && j==col-1)return 0;
        int max=0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(i-1>=0 && j+1<col && arr[i-1][j+1]>arr[i][j])
        {
            max=1+finder(arr,i-1,j+1,dp);
        }
        if(j+1<col && arr[i][j+1]>arr[i][j])
        {
            max=Math.max(max,1+finder(arr,i,j+1,dp));
        }
        if(j+1<col && i+1<row && arr[i+1][j+1]>arr[i][j])
        {
            max=Math.max(max,1+finder(arr,i+1,j+1,dp));
        }
        return dp[i][j]=max;
    }
}