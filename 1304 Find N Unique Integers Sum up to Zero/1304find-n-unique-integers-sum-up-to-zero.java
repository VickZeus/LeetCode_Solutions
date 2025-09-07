class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int sum=0;

        for(int j=1;j<n;j++){
            arr[j-1]=j;
            sum+=j;
        }
        arr[n-1]=-sum;
        return arr;
    }
}