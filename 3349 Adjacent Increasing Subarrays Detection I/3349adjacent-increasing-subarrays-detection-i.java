class Solution {
    public boolean check(int i,int j,List<Integer> nums){
        while(i+1<j){
            if(nums.get(i)>=nums.get(i+1))return false;
            i++;
        }
        return true;
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k){
        if(k==1)return true;
        for(int i=0;i<=nums.size()-2*k;i++){
            boolean ans=check(i,i+k,nums) && check(i+k,i+2*k,nums) ;
            if(ans)return true;
        }
        return false;
    }
}