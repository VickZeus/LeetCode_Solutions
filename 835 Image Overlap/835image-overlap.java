class Solution {
    public int[][] mat1,mat2;
    public int countM,n;

    public void compare(int i,int j){ 
        int count=0,val;
        for(int i2=0;i2<n;i2++){
            for(int j2=0;j2<n;j2++){
                val=(i2-i<0 || j2-j<0 || i2-i>=n  || j2-j>=n)?0:mat1[i2-i][j2-j]; 
                count+=(val==1 && mat2[i2][j2]==1)?1:0;
            }
        }
        countM=Math.max(countM,count);
    }   

    public int largestOverlap(int[][] img1, int[][] img2) {
        n=img1.length;
        countM=0;
        mat1=img1;mat2=img2;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                compare(i,j); // i, j tells the translation state
                compare(-i,-j);
                compare(-i,j);
                compare(i,-j);
            }
        }
        return countM;
    }
}