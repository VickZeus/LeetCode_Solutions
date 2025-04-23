class Solution 
{
    public int countLargestGroup(int n) 
    {
        int[] sum=new int[37];
        int max=-1;

        for(int i=1;i<=n;i++)
        {
            int k=0;
            int j=i;
            while(j!=0)
            {
                int rem=j%10;
                k+=rem;
                j=(j-rem)/10;
            }
            sum[k]+=1;
            if(sum[k]>max)max=sum[k];
        } 

        int count=0;
        for(int i:sum)
        {
            if(i==max)count++;
        }
        return count;
    }
}