class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        ArrayList<Boolean> obj=new ArrayList<>();
        int max=0;
        for(int k:candies)
        {
            if(k>max)max=k;
        }
        for(int k:candies)
        {
            obj.add((k+extraCandies>=max)?true:false);
        }
        return obj;
    }
}