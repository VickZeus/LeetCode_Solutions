class Solution {
    public int smallestNumber(int n, int t) {
        while(n>-1){
            int temp=n;
            int pro=1;
            while(temp>0){
                pro*=temp%10;
                temp=temp/10;
            }
            if(pro%t==0)return n;
            n++;
        }
        return -1;
    }
}