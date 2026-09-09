class Solution {
    public long countCommas(long n) {
        long commaC=0,X=0,i=0;

        while(true){
            X=(long)Math.pow(10,3*(i+1))-1;
            
            if(X>=n){commaC+=(n-Math.pow(10,3*i)+1)*i;break;}
            if(X<n)commaC+=i*999*(long)Math.pow(10,3*i);
            i++;
        }
        return commaC;
    }
}