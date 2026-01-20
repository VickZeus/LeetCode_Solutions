class Solution {
    public int[] minBitwiseArray(List<Integer> nums) 
    {
        int n=nums.size();
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int x=0;x<=nums.get(i);x++)
            {
                if((x|(x+1))==nums.get(i))
                {
                    res[i]=x;
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                res[i]=-1;
            }
        } 
        return res;   
    }
}