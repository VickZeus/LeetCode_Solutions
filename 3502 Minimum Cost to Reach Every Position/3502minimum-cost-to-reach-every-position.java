class Solution {
    public int[] minCosts(int[] cost) 
    {
        int[] ans=new int[cost.length];
        int min=cost[0];
        for(int i=0;i<cost.length;i++)
        {
            if(cost[i]<=min)
            {
                ans[i]=cost[i];
            }
            else
            {
                ans[i]=min;
            }
            if(cost[i]<min)min=cost[i];
        }
        return ans;
        
    }
}