class Solution {
    List<Integer> ans;
    int n,m;

    public void compute(int[][] mat,int i,int j,int k){
        if(mat[i][j]==101)return;
        if(k==1){
            while(mat[i][j]!=101){
                ans.add(mat[i][j]);
                mat[i][j]=101;
                j++;
                if(j==m)break;
            }
            if(i+1<n && j-1>-1)compute(mat,i+1,j-1,2);
        }

        if(k==2){
            while(mat[i][j]!=101){
                ans.add(mat[i][j]);
                mat[i][j]=101;
                i++;
                if(i==n)break;
            }
            if(i-1>-1&& j-1>-1)compute(mat,i-1,j-1,3);
        }

        if(k==3){
            while(mat[i][j]!=101){
                ans.add(mat[i][j]);
                mat[i][j]=101;
                j--;
                if(j<0)break;
            }
            if(i-1>-1 && j+1<m)compute(mat,i-1,j+1,4);
        }

        if(k==4){
            while(mat[i][j]!=101){
                ans.add(mat[i][j]);mat[i][j]=101;
                i--;
                if(i<0)break;
            }
            if(i+1<n)compute(mat,i+1,j+1,1);
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        ans=new ArrayList<>();
        n=matrix.length;
        m=matrix[0].length;

        compute(matrix,0,0,1);
        return ans;
    }
}