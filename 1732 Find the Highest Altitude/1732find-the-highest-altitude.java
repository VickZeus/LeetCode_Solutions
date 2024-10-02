class Solution {
    public int largestAltitude(int[] gain) 
    {
        int[] arr=new int[gain.length+1];
        arr[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            arr[i+1]=gain[i]+arr[i];
        }   
        int max=0;
        for(int k:arr)
        {
            if(k>max)max=k;
        }

        //System.out.println(Arrays.toString(arr));
        return max; 
    }
}