class Solution {
    public int longestBalanced(int[] nums) {
        HashMap<Integer,Boolean> done=new HashMap<>();
        int max=0;
        int i,j;
        for(i=0;i<nums.length;i++){
            int ec=0,oc=0;
            done=new HashMap<>();
            for(j=i;j<nums.length;j++){
                if(!done.getOrDefault(nums[j],false) && nums[j]%2==0){
                    ec++;done.put(nums[j],true);
                }
                if(!done.getOrDefault(nums[j],false) && nums[j]%2!=0){
                    oc++;done.put(nums[j],true);
                }
                if(ec==oc)max=Math.max(max,j-i+1);
            }
            
        }

        return max;
    }
}