class Solution 
{
    public int maxDifference(String s) 
    {
        HashMap<Character,Integer> obj=new HashMap<>();
        int maxo=0,mine=Integer.MAX_VALUE;
        for(char ch:s.toCharArray())
        {
            int k=obj.getOrDefault(ch,0);
            obj.put(ch,k+1);
        }

        for(char ch:obj.keySet())
        {
            int val=obj.get(ch);

            if(val%2==0)
            {
                mine=(mine<val)?mine:val;
            }
            else
            {
                maxo=(maxo>val)?maxo:val;
            }
        }
        System.out.println(obj.toString()+"  "+maxo+","+mine);
        return maxo-mine;
    }
}