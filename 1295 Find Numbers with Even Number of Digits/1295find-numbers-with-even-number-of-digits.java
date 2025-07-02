class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
        for(int i:nums)
        {
            if((10<i && i<100)||(1000<=i && i<10000)|| (i>99999))
            {
                count++;
            }
        }    
        return count;
    }
}