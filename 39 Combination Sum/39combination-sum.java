class Solution {
    List<List<Integer>> ans;
    int n;

    public void generate(int[] candidate,int target,List<Integer> k,int i,int csum){
        if(csum>target)return;
        
        if(csum==target){
            ans.add(new ArrayList<>(k));
            return;
        }

        for(int j=i;j<n;j++){
            k.add(candidate[j]);
            generate(candidate,target,k,j,csum+candidate[j]);
            k.remove(k.size()-1);
        }
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target){
        ans=new ArrayList<>();  
        n=candidates.length;
        generate(candidates,target,new ArrayList<>(),0,0);
        return ans;  
    }
}