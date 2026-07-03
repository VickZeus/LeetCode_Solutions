class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans=new ArrayList<>();
        
        int n=nums.length;
        int i,j;

        for(int k=0;k<n;k++){
            if(k>0 && nums[k]==nums[k-1])continue;
            i=k+1;
            j=n-1;
            while(j>i){
                if(nums[i]+nums[j]>-1*nums[k]){
                    j--;
                }
                else if(nums[i]+nums[j]<-1*nums[k]){
                    i++;
                }
                else{
                    ans.add(List.of(nums[k],nums[i],nums[j]));
                    i++;j--;
                    while(i<j && nums[i]==nums[i-1])i++;
                    while(i<j && nums[j]==nums[j+1])j--;
                }   
        }
        }
        return ans;
        }
}