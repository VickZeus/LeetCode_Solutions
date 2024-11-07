class Solution {
    public int largestCombination(int[] candidates) 
    {
        int maxn=0;
        for(int i=0;i<=24;i++)
        {
            int c=0;
            for(int k:candidates)
            {
                c+=k>>i & 1;
            }
            maxn=Math.max(maxn,c);
        } 
        return maxn;   
    }
}