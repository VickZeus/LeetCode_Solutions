class Solution {
    public int xorOperation(int n, int start) {
        int k=start;
        for(int i=1;i<n;i++){
            k^=start+2*i;
        }
        return k;
    }
}