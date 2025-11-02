class Solution {

    public void deconnectIsland(char[][] grid,int i,int j,int r,int c){
        if(i>=r || j>=c || i<0 || j<0)return;
        if(grid[i][j]=='0')return;
        if(grid[i][j]=='1')grid[i][j]='0';

        deconnectIsland(grid,i+1,j,r,c);
        deconnectIsland(grid,i-1,j,r,c);
        deconnectIsland(grid,i,j+1,r,c);
        deconnectIsland(grid,i,j-1,r,c);
    }

    public int numIslands(char[][] grid) {
        int count=0;
        int r=grid.length,c=grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]!='1')continue;
                if(grid[i][j]=='1'){
                    count++;
                    deconnectIsland(grid,i,j,r,c);
                }
            }
        }
        return count;
    }
}