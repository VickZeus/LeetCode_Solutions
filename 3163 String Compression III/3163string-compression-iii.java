class Solution {
    public String compressedString(String word) 
    {
        StringBuilder obj=new StringBuilder("");
        int c=1;
        char ch=word.charAt(0);

        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                c++;
                if(c>9)
                {
                    obj.append('9');obj.append(ch);
                    c=c-9;
                }
            }
            else 
            {
                obj.append(Integer.toString(c));obj.append(ch);
                ch=word.charAt(i);c=1;
            }
        }
        obj.append(Integer.toString(c));obj.append(ch);
        return obj.toString();
    }
}