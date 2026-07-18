class Solution {

    public int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }

    public int findGCD(int[] nums) {
        int maxN=Integer.MIN_VALUE,minN=Integer.MAX_VALUE;
        for(int n:nums){
            maxN=Math.max(maxN,n);
            minN=Math.min(minN,n);
        }

        return gcd(minN,maxN);
    }
}