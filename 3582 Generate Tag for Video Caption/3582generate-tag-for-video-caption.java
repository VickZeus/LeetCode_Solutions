class Solution 
{
    public String generateTag(String caption) 
    {
        if(caption.length()==0)return "#";
        StringBuilder obj=new StringBuilder();
        obj.append('#');
        caption=caption.trim();
        for(int i=0;i<caption.length();i++)
        {
            if(obj.toString().length()==100)break;
            if(caption.charAt(i)==' ' || !Character.isLetter(caption.charAt(i)))continue;
            if(i==0 || caption.charAt(i-1)!=' ')
            {
                obj.append(Character.toLowerCase(caption.charAt(i)));
            }
            else
            {
                obj.append(Character.toUpperCase(caption.charAt(i)));
            }

        }
        return obj.toString();
    }
}