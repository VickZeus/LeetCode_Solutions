class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        
        if(n<3)return n;

        int power=(int)Math.floor(Math.log(n)/Math.log(2))+1;
        return (int)Math.pow(2,power);
    }
}