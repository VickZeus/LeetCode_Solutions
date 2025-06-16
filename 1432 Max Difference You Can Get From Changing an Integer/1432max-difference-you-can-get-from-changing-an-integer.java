class Solution 
{
    public int replace(int[] arr,int n1,int n)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n1)arr[i]=n;
        }
        return make(arr);
    }

    public int make(int[] arr)
    {
        int n=arr.length-1;
        int n1=0;
        while(n>-1)
        {
            n1=n1*10+arr[n];
            n--;
        }
        return n1;
    }

    public int maxN(int[] arr,int n)
    {
        int max=-100;
        if(arr[n]==9)
        {
            while(n>0 && arr[n]==9)
            {
                n--;
            }
            max=replace(arr,arr[n],9);
        }
        else 
        {
            max=replace(arr,arr[n],9);
        }
        System.out.println(max);
        return max;
    }

    public int minN(int[] arr,int n)
    {
        int min=100;
        if(arr[n]!=1)
        {
            min=replace(arr,arr[n],1);
        }
        else 
        {
            while(n>0 && (arr[n]==1 || arr[n]==0) )
            {
                n--;
            }
            if(arr[n]==1)return make(arr);
            min=replace(arr,arr[n],0);
        }
        System.out.println(min);
        return min;
    }

    public int[] initialise(int[] arr,int n)
    {
        int k=0;
        while(n>0)
        {
            arr[k++]=n%10;
            n=n/10;
        }
        return arr;
    }

    public int maxDiff(int num) 
    {
        int n=Integer.toString(num).length();
        int[] arr=new int[n];
        arr=initialise(arr,num);
        return maxN(arr.clone(),n-1)-minN(arr.clone(),n-1);
    }
}