class Solution {
    List<Integer> ans;

    public void DFS(int i,int n){
        if(i>n)return; 

        ans.add(i);
        for(int digit=0;digit<10;digit++){
            int next=i*10+digit;
            if(next>n)break; 
            DFS(next,n);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        ans=new ArrayList<>();
        for(int i=1;i<=9;i++)DFS(i,n);
        return ans;
    }
}