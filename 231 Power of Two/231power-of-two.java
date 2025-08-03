class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;
        if(n<=0)return false;
        while(n>0){
            count+=n&1;
            n=n>>1;
            if(count==2)return false;
        }
        return true;
    }
}