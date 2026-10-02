class Solution {
    List<String> ans;

    public void Generate(int n,int lp,int rp,String s,HashSet<String> k){
        if(lp+rp==2*n){
            if(!k.contains(s) && lp==rp){
                k.add(s);
                ans.add(s);
            }
            return;
        }

        Generate(n,lp+1,rp,s+"(",k);
        if(lp>rp)Generate(n,lp,rp+1,s+")",k);
    }

    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        HashSet<String> k=new HashSet<>();
        Generate(n,1,0,"(",k);
        return ans;
    }
}