class Solution 
{
    public long pickGifts(int[] gifts, int k) 
    {
        long sum=0;
        while(k>0)
        {
            int index=0;
            int maxn=0;
            for(int i=0;i<gifts.length;i++)
            {
                if(gifts[i]>maxn)
                {
                    index=i;
                    maxn=gifts[i];
                }
            }
            gifts[index]=(int)Math.sqrt(gifts[index]);
            k--;
        }       
        for(int j:gifts)sum+=j;
        return sum; 
    }
}