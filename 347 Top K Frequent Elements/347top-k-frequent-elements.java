class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i:nums)
        {
            obj.put(i,obj.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->obj.get(b)-obj.get(a));
        for(int i:obj.keySet())pq.add(i);

        int[] ans=new int[k];
        while(k>0)
        {
            ans[--k]=pq.poll();
        }
        return ans;
    }
}