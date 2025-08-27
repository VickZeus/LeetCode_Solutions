class Solution {
    public long maximumTripletValue(int[] nums) {
        HashMap<Integer,Long> maxB=new HashMap<>();
        HashMap<Integer,Long> maxA=new HashMap<>();
    
        long maxv=0,maxb=0,maxa=0;
        for(int i=0;i<nums.length;i++){
            maxB.put(i,maxb);
            if(nums[i]>maxb)maxb=nums[i];

        }

        for(int j=nums.length-1;j>=0;j--){
            maxA.put(j,maxa);
            if(nums[j]>maxa)maxa=nums[j];

        }

        for(int j=0;j<nums.length;j++){
            long k=(maxB.get(j)-nums[j])*maxA.get(j);
            maxv=Math.max(maxv,k);
        }

        return maxv;
    }
}