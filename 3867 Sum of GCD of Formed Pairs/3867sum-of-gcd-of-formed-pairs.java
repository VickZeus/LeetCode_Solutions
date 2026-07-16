class Solution {

    public int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }

    public long gcdSum(int[] nums) {
        int maxN=nums[0];
        int n=nums.length;
        long sum=0;

        int[] gcd=new int[n];
        for(int i=0;i<n;i++){maxN=Math.max(maxN,nums[i]);gcd[i]=gcd(nums[i],maxN);}
        Arrays.sort(gcd);
        for(int i=0;i<n/2;i++){
            sum+=gcd(gcd[i],gcd[n-i-1]);
        }
        return sum;

    }
}