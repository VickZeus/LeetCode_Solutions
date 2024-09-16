class Solution {
    public int findMinDifference(List<String> timePoints) 
    {
        int min_diff=1000000;
        int max=0;int min=10000;
        int k=0;
        int[] arr=new int[timePoints.size()];
        for(String i:timePoints)
        {
            
            String[] l=i.split(":");
            arr[k]=Integer.parseInt(l[0])*60+Integer.parseInt(l[1]);
            if(arr[k]>=24*60)
            {
                arr[k]-=24*60;
            }
            if(arr[k]==0)
            {
                arr[k]=24*60;
            }
            if(arr[k]>max)
            {
                max=arr[k];
            }
            if(arr[k]<min)
            {
                min=arr[k];
            }
            k++;
        }

        for(k=0;k<arr.length;k++)
        {
            for(int j=k+1;j<arr.length;j++)
            {
                if(Math.abs(arr[k]-arr[j])<min_diff)
                {
                    min_diff=Math.min(Math.abs(arr[k]-arr[j]),24*60-Math.abs(arr[k]-arr[j]));
                }
            }
        }
        return Math.min(min_diff,24*60-max+min);


    }
}