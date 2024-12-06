class Solution {
    public int maxCount(int[] banned, int n, int maxSum) 
    {
        HashSet<Integer> obj=new HashSet<>();
        for(int k:banned)obj.add(k);
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(!obj.contains(i))
            {
            sum+=i;
            if(sum>maxSum)return count;
            count++;
            }
        }   
        return count;
    }
}