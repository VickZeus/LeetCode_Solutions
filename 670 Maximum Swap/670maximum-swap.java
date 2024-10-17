class Solution {
    public int maximumSwap(int num) 
    {
        String s=String.valueOf(num);
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i)-'0';
        }    
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            int max=0;int k=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>=max)
                {
                    max=arr[j];
                    k=j;
                }
            }
            if(max>arr[i])
            {
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        //System.out.println(Arrays.toString(arr));
        int n=0;
        for(int k:arr)
        {
            n=n*10+k;
        }
        return n;
    }
}