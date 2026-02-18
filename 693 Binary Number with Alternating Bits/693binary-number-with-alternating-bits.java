class Solution {
    public boolean hasAlternatingBits(int n) {
        int k=n^(n>>1);
        return (k&(k+1))==0;
    }
}