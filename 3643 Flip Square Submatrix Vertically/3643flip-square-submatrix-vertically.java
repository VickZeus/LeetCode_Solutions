class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] stor=new int[k][k];
        int[] arr;
        int index=0,index2;

        for(int i=x;i<x+k;i++){
            arr=new int[k];
            index2=0;
            for(int j=y;j<y+k;j++){
                arr[index2++]=grid[i][j];
            }
            stor[index++]=arr;
        }
        index=k-1;
        for(int i=x;i<x+k;i++){
            index2=0;
            for(int j=y;j<y+k;j++){
                grid[i][j]=stor[index][index2++];
            }
            index--;
        }
        return grid;
    }
}