class Solution {
    public String makeFancyString(String s) 
    {
        StringBuilder s2=new StringBuilder("");
        int count=1;
        char ch=s.charAt(0);
        s2.append(ch);
        for(int i=1;i<s.length();i++)
        {
           if(s.charAt(i)==ch)
           {
                if(count<2)
                {
                    s2.append(s.charAt(i));
                    count++;
                }
           }
           if(s.charAt(i)!=ch)
           {
                count=1;
                ch=s.charAt(i);
                s2.append(s.charAt(i));
           } 
        } 
        return s2.toString();
    }
}