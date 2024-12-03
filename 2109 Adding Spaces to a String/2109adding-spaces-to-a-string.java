class Solution 
{
    public String addSpaces(String s, int[] spaces) 
    {
        StringBuilder obj=new StringBuilder("");
        int k=0;
        if(spaces[0]==0)
        {
            obj.append(" ");k++;
        }
        for(int i=0;i<s.length();i++)
        {
            obj.append(s.charAt(i));
            if(k<spaces.length && i==spaces[k]-1)
            {
                obj.append(" ");
                k++;
            }  
        }

        return obj.toString();
    }
}