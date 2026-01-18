class Solution {
    public int[][]r;
    public int[][]c;
    public int[][]d1;
    public int[][]d2;

    public void calcPRESUM(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                r[i][j]=grid[i][j]+(j>0?r[i][j-1]:0);
                c[i][j]=grid[i][j]+(i>0?c[i-1][j]:0);
                d1[i][j]=grid[i][j]+(i>0&&j>0?d1[i-1][j-1]:0);
                d2[i][j]=grid[i][j]+(i>0&&j+1<grid[0].length?d2[i-1][j+1]:0);
            }
        }
    }

    public boolean checkR(int[][] grid,int i,int j,int k){
        int sum=r[i][j+k-1]-(j>0?r[i][j-1]:0);
        for(int h=0;h<k;h++){
            if(r[i+h][j+k-1]-(j>0?r[i+h][j-1]:0)!=sum)return false;
        }
        return true;
    }

    public boolean checkC(int[][] grid,int i,int j,int k){
        int sum=c[i+k-1][j]-(i>0?c[i-1][j]:0);
        for(int h=0;h<k;h++){
            if(c[i+k-1][j+h]-(i>0?c[i-1][j+h]:0)!=sum)return false;
        }
        return true;
    }

    public boolean check(int[][] grid,int i,int j,int k){
        int diffr=r[i][j+k-1]-(j>0?r[i][j-1]:0);
        int diffc=c[i+k-1][j]-(i>0?c[i-1][j]:0);
        int diff1=d1[i+k-1][j+k-1]-(i>0&&j>0?d1[i-1][j-1]:0);
        int diff2=d2[i+k-1][j]-(i>0&&j+k<grid[0].length?d2[i-1][j+k]:0);

        if(diffr==diffc&&diffc==diff1&&diff1==diff2){
            return checkR(grid,i,j,k)&&checkC(grid,i,j,k);
        }
        return false;
    }

    public int largestMagicSquare(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        r=new int[m][n];
        c=new int[m][n];
        d1=new int[m][n];
        d2=new int[m][n];

        calcPRESUM(grid);

        int k=Math.min(m,n);
        while(k>1){
            for(int i=0;i<=m-k;i++){
                for(int j=0;j<=n-k;j++){
                    if(check(grid,i,j,k))return k;
                }
            }
            k--;
        }
        return 1;
    }
}
