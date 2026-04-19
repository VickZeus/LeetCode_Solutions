class Solution {
    public int[][] colorGrid(int n,int m,int[][] sources){
        int[][] rod=sources;
        int[][] grid=new int[n][m],dist=new int[n][m];
        for(int i=0;i<n;i++)Arrays.fill(dist[i],Integer.MAX_VALUE);
        Queue<int[]> q=new LinkedList<>();
        for(int[] s:rod){
            int r=s[0],c=s[1],color=s[2];
            q.offer(new int[]{r,c,0,color});
            grid[r][c]=color;
            dist[r][c]=0;
        }
        int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int r=cur[0],c=cur[1],t=cur[2],color=cur[3];
            for(int[] d:dirs){
                int nr=r+d[0],nc=c+d[1];
                if(nr<0||nc<0||nr>=n||nc>=m)continue;
                int nt=t+1;
                if(dist[nr][nc]>nt){
                    dist[nr][nc]=nt;
                    grid[nr][nc]=color;
                    q.offer(new int[]{nr,nc,nt,color});
                }else if(dist[nr][nc]==nt&&grid[nr][nc]<color){
                    grid[nr][nc]=color;
                    q.offer(new int[]{nr,nc,nt,color});
                }
            }
        }
        return grid;
    }
}