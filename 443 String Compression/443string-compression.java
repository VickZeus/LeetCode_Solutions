class Solution {
    public int compress(char[] chars) 
    {
       StringBuilder obj=new StringBuilder("");
       char ch=chars[0];
       int count=0;
       for(char k:chars)
        {
            if(k==ch)++count;
            if(k!=ch)
            {
                obj.append(ch);
                if(count>1)obj.append(count);
                ch=k;
                count=1;
            }
        }
        obj.append(ch);
        if(count>1)obj.append(count);
        String s=obj.toString();
        for(int i=0;i<chars.length;i++)
        {
            if(i<s.length())
            {
                chars[i]=s.charAt(i);
            }
            else 
            {
                chars[i]=' ';
            }
        }
        return s.length();
    }
}