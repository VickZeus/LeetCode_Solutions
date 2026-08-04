class Solution {
    List<List<Integer>> ans; 
    
    public void compute(int j,int n,int[] nums,List<Integer> temp){
        if(j==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        compute(j+1,n,nums,temp);//not include  
        
        temp.add(nums[j]);
        compute(j+1,n,nums,temp); //include
        temp.removeLast();
    }

    public List<List<Integer>> subsets(int[] nums){
        ans=new ArrayList<>();
        int n=nums.length;
        compute(0,n,nums,new ArrayList<Integer>());
        return ans;
    }
}