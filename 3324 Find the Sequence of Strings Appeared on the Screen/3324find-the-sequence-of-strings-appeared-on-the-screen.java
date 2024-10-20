class Solution 
{

    public String remover(String s)
    {
        StringBuilder obj=new StringBuilder("");
        for(int i=0;i<s.length()-1;i++)
        {
            obj.append(s.charAt(i));
        }
        return obj.toString();
    }


    public List<String> stringSequence(String target) 
    {
        String s="";
        ArrayList<String> obj=new ArrayList();
        for(char ch:target.toCharArray())
        {
            for(char ch2='a';ch2<='z';ch2++)
            {
                if(ch2==ch)
                {
                    s=remover(s);
                    s+=Character.toString(ch2);
                    obj.add(s);
                    s+=Character.toString('a');
                    break;
                }
                else if(ch2!=ch)
                {
                    s=remover(s);
                    s+=Character.toString(ch2);
                    obj.add(s);
                }
            }
        }
        return obj;
    }
}