class Solution {
    public int[][] makePF(int[][] dp,int[][] mat,int n,int m){
        dp[0][0]=mat[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=
                    ((i-1>=0)?dp[i-1][j]:0)+
                    ((j-1>=0)?dp[i][j-1]:0)+mat[i][j]-
                    ((i-1>=0 && j-1>=0)?dp[i-1][j-1]:0);
            }
        }
        return dp;
    }


    public int find(int[][] dp,int target){
        int n=dp.length,m=dp[0].length;
        int ans=0;
        for(int k=1;k<=Math.min(n,m);k++){
            boolean ok=false;
            for(int i=k-1;i<n&&!ok;i++){
                for (int j=k-1;j<m;j++){
                    int sum=
                        dp[i][j]
                      -(i-k>=0?dp[i-k][j]:0)
                      -(j-k>=0?dp[i][j-k]:0)
                      +(i-k>=0&&j-k>=0?dp[i-k][j-k]:0);
                    if(sum<=target){
                        ok=true;
                        break;
                    }
                }
            }
            if(ok)ans=k;
            else break;
        }
        return ans;
    }

    public int maxSideLength(int[][] mat, int threshold) {
        int n=mat.length,m=mat[0].length;
        int[][] dp=new int[n][m];
        dp=makePF(dp,mat,n,m);
        return find(dp,threshold);
    }
}