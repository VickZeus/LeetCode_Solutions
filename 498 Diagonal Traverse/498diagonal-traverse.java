class Solution 
{
    int row,col;
    boolean[][] val;
    boolean flag;

    public int[] printer(int[] ans , int index, int[][] mat,int i,int j){
        ans[index++]=mat[i][j];val[i][j]=true;
        if(flag){
            if(i+1<row && j-1>-1 && !val[i+1][j-1]){
                return printer(ans,index,mat,i+1,j-1);
            }
            else{
                flag=!flag;
                if(i+1<row && !val[i+1][j])return printer(ans,index,mat,i+1,j);
                if(j+1<col && !val[i][j+1])return printer(ans,index,mat,i,j+1);
                
            }
        }
        else{
            if(i-1>-1 && j+1<col && !val[i-1][j+1]){
                return printer(ans,index,mat,i-1,j+1);
            }
            else{
                flag=!flag;
                if(j+1<col && !val[i][j+1])return printer(ans,index,mat,i,j+1);
                if(i+1<row && !val[i+1][j])return printer(ans,index,mat,i+1,j);  
            }
        }
        return ans;
    }

    public int[] findDiagonalOrder(int[][] mat) {
        row=mat.length; //row 
        col=mat[0].length; //columns
        int[] ans;
        val=new boolean[row][col];
        if(row==1 && col==1) return mat[0];
        if(row==1)return mat[0];
        if(col==1){
            ans=new int[row];
            for(int i=0;i<row;i++)ans[i]=mat[i][0];
            return ans;
        }

        flag=false;
        int index=0;
        ans=new int[row*col];
        ans=printer(ans,index,mat,0,0);ans[row*col-1]=mat[row-1][col-1];
        return ans;
    }
}