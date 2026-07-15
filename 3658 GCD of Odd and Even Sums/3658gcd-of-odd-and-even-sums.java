class Solution {
    public int GCD(int a,int b){
        if(a==0)return b;
        return GCD(b%a,a);
    }
    public int gcdOfOddEvenSums(int n) {
        int evesum=0,oddsum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                evesum+=i;
            }
            else{
                oddsum+=i;
            }
        }
        return GCD(oddsum,evesum);
    }
}