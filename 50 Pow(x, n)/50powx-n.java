class Solution {
    public double myPow(double x, int n) {
        
        if(n<0){
            x=1/x;n=-n;
        }
        return calPow(x,n);
    }

    public double calPow(double x,int n){
        if(n==0)return 1;

        double half=calPow(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}