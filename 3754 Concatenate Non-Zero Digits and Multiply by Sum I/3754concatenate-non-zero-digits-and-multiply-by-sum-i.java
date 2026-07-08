class Solution {
    public long sumAndMultiply(int n) {
        if(n==0)return 0;
        long sum=0,rem;
        StringBuilder x=new StringBuilder("");

        while(n!=0){
            rem=n%10;
            if(rem!=0)x.append(rem);
            sum+=rem;
            n=n/10;
        }
        return (long)sum*Long.valueOf(x.reverse().toString());
    }
}