class Solution {
    public int kthFactor(int n, int k) {
        int i=1;
        while(i<=n && k>0){
            if(n%i==0 && k==1)return i;
            if(n%i==0)k--;
            i++;
        }
        return -1;
    }
}