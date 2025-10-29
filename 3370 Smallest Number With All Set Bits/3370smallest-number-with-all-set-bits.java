class Solution {
    public int smallestNumber(int n) {
        if(~n==0)return n;
        int h=(int)(Math.log(n)/Math.log(2));
        return (int)Math.pow(2,h+1)-1;
    }
}