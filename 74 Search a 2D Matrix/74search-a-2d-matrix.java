class Solution {

    public int BSRow(int target,int left,int right,int[][] matrix){ // log(m)
        int mid=(left+right)/2;
        if(left<=right){
            if(matrix[mid][0]<=target && target<=matrix[mid][matrix[0].length-1])return mid;
            if(target<matrix[mid][0]){
                return BSRow(target,left,mid-1,matrix);
            }
            else{
                return BSRow(target,mid+1,right,matrix);
            }
        }
        return -1; 
    }

    public boolean BSCol(int target,int left,int right,int[][] matrix,int idx){ // log(n)
        int mid=(left+right)/2;
        if(left<=right){
            if(target==matrix[idx][mid])return true;
            if(target>matrix[idx][mid]){
                return BSCol(target,mid+1,right,matrix,idx);
            }
            else{
                return BSCol(target,left,mid-1,matrix,idx);
            }
        }
        return false;
    }   

    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0][0]==target)return true;
        int idx=BSRow(target,0,matrix.length-1,matrix);
        if(idx==-1)return false;
        System.out.println(idx);
        return BSCol(target,0,matrix[0].length-1,matrix,idx);
    }
}