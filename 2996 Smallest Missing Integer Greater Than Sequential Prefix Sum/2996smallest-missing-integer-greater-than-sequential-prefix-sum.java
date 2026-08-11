class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums)hs.add(i);

        int sum=nums[0],n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]+1==nums[i]){
                sum+=nums[i];
            }
            else{
                break;
            }
        }

        while(hs.contains(sum)){sum++;}
        return sum;
    }
}