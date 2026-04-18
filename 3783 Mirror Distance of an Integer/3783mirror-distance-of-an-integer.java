class Solution {
    public int mirrorDistance(int n) {
        int rev=0,cpy=n,rem;
        while(cpy>0){
            rem=cpy%10;
            rev=10*rev+rem;
            cpy=cpy/10;
        }

        return Math.abs(n-rev);
    }
}