class Solution 
{
    public int calc(int[] minC,int[] cost,int n)
    {
        if(n<0)return 0;
        if(minC[n]!=-1)return minC[n];
        int l1=calc(minC,cost,n-1);
        int l2=calc(minC,cost,n-2);
        minC[n]=Math.min(l1,l2)+cost[n];
        return minC[n]; 
    }

    public int minCostClimbingStairs(int[] cost)
    {
        int[] minC=new int[cost.length+1];
        minC[0]=cost[0];
        minC[1]=cost[1];
        Arrays.fill(minC,-1);
        return Math.min(calc(minC,cost,cost.length-1),calc(minC,cost,cost.length-2));
    }
}