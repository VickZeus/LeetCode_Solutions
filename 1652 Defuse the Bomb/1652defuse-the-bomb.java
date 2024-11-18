class Solution 
{
    public int[] decrypt(int[] code, int k) 
    {
        int arr[]=new int[code.length];
        if(k==0)return arr;

        int sum=0;

        if(k>0)
        {
            for(int i=0;i<k;i++)sum+=code[i];
            for(int i=0;i<code.length;i++)
            {
                sum=sum-code[i]+code[(i+k)%code.length];
                arr[i]=sum;
            }
        }

        if(k<0)
        {
            k=-k;
            for(int i=code.length-k;i<code.length;i++)
            {
                sum+=code[i];
            }
            for(int i=0;i<code.length;i++)
            {
                arr[i]=sum;
                sum=sum-code[Math.abs(i - k + code.length)%code.length]+code[i];
            }
        }

        return arr;

    }
}