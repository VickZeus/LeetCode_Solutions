class Solution {
    public long maxMatrixSum(int[][] matrix) 
    {
        long sum=0;
        long negcount=0;
        long minim=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<0)negcount++;
                matrix[i][j]=(matrix[i][j]>0)?matrix[i][j]:-matrix[i][j];
                sum+=matrix[i][j];
                if(matrix[i][j]<minim)minim=matrix[i][j];
            }
        } 
        if(negcount%2==0)return sum;
        return sum-2*minim;   
    }
}