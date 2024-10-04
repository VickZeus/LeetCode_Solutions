class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        int max=0;
        for(int k : score)
        {
            if(k>max)max=k;
        }

        int[] arr=new int[max+1];
        for(int i:score)
        {
            arr[i]=i;
        }    

        HashMap<Integer,String> obj=new HashMap<>();
        int h=max;
        int k=1;
        while(h>=0)
        {
            if(arr[h]!=0 && h!=0)
            {
                if(k>3)obj.put(h,String.valueOf(k));
                if(k==3)obj.put(h,"Bronze Medal");
                if(k==2)obj.put(h,"Silver Medal");
                if(k==1)obj.put(h,"Gold Medal");
                k++;
            }
            if(h==0)
            {
                obj.put(0,String.valueOf(score.length));
            }
            h--;
        }
        String[] arr2=new String[score.length];
        for(int g=0;g<score.length;g++)
        {
            arr2[g]=obj.get(score[g]);
        }
        return arr2;
    }
}