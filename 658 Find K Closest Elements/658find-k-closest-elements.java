class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x)
    {

        PriorityQueue<Integer> obj=new PriorityQueue<>(
            (a,b)->
            {
                int difa=Math.abs(a-x);
                int difb=Math.abs(b-x);

                if(difa!=difb)return difa-difb;
                return a-b;
            }
        );    

        for(int j:arr)obj.add(j);
        List<Integer> ans=new ArrayList<>();

        while(k>0)
        {
            --k;
            ans.add(obj.poll());
        }
        Collections.sort(ans);
        return ans;
    }
}