class Solution 
{
    public int findLucky(int[] arr) 
    {
        int[] freq=new int[501];

        for(int i:arr)freq[i]+=1;
        int max=-1;
        for(int j=1;j<501;j++)
        {
            if(freq[j]==j)
            {
                max=(max>j)?max:j;
            }
        }
        return max;
    }
}