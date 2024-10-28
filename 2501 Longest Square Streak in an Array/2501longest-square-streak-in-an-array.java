class Solution 
{

    public int finder(HashSet<Integer> k, int n,int c)
    {
        int root=(int)Math.sqrt(n);
        if(k.contains(root) && k.contains(n) && root*root==n)
        {
            return finder(k,n*n,++c);
        }
        return c;
    }

    public int longestSquareStreak(int[] nums) 
    {
        HashSet<Integer> obj=new HashSet<>();
        for(int i:nums)obj.add(i);
        int max=0;
        for(int k:nums)
        {
            int k2=finder(obj,k,1);
            //System.out.println(k+"  "+k2);
            if(k2>max)max=k2;
        }
        if(max<2)return -1;
        return max;

    }
}