class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length,c=grid[0].length;
        int[][] cost=new int[r][c];

        int sr=0,sc=0;
        for(int i=0;i<r;i++){
            cost[i][0]=sr+grid[i][0];
            sr+=grid[i][0];
        }
        for(int i=0;i<c;i++){
            cost[0][i]=sc+grid[0][i];
            sc+=grid[0][i];
        }

        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                cost[i][j]=grid[i][j]+Math.min(cost[i-1][j],cost[i][j-1]);
            }
        }
        return cost[r-1][c-1];
    }
}