class Solution {
    List<List<Integer>> ans;

    public void compute(int j,int[] nums,List<Integer> temp){
        if(j==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int k:nums){
            if(!temp.contains(k)){
                temp.add(k);
                compute(j+1,nums,temp);
                temp.removeLast();
            }
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        compute(0,nums,new ArrayList<Integer>());
        return ans;
    }
}