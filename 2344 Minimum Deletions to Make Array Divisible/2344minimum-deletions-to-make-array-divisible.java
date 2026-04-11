class Solution {

    public int GCD(int a,int b){
        if(a==0)return b;
        return GCD(b%a,a);
    }

    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);

        int gcd=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){ // compute the GCD
            gcd=GCD(gcd,numsDivide[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            if(gcd%nums[i]==0)return i;
        }
        return -1;
    }
}