class Solution 
{
    public int maxProduct(int[] nums) 
    {
        PriorityQueue<Integer> obj=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums)obj.add(i);
        return (obj.poll()-1)*(obj.poll()-1);
    }
}