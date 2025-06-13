class Solution
 {
    public int maxProfit(int[] prices) 
    {
        int buy=prices[0];
        int maxP=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>=buy)
            {
                maxP=(maxP>prices[i]-buy)?maxP:prices[i]-buy;
            }
            else 
            {
                buy=prices[i];
            }
        }
        return maxP;
    }
}