class Solution {
    public long[] sumOfThree(long num) {
        long[] ans;
        if(3*(num/3)!=num)return new long[0];

        ans=new long[3];
        long x=(long)num/3;
        ans[0]=x-1;
        ans[1]=x;
        ans[2]=x+1;
        return ans;
    }
}