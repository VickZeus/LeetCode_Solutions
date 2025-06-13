class Solution 
{
    public List<Integer> calc(List<Integer> obj)
    {
        int n=obj.size()+1;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
                ans.add(1);
            }
            else
            {
                ans.add(obj.get(i)+obj.get(i-1));
            }
        }
        return ans;
    }


    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> k=new ArrayList<>();
        k.add(1);
        ans.add(k);
        for(int i=0;i<numRows-1;i++)
        {
            k=calc(k);
            ans.add(k);
        }
        return ans;
    }
}