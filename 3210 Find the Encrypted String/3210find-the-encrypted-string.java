class Solution {
    public String getEncryptedString(String s, int k) 
    {
        String s2="";char ch2=' ';
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (i+k>=s.length())
            {
                ch2=s.charAt(i+k-s.length()*(int)((i+k)/s.length()));
            }
            else 
            {
                ch2=s.charAt(i+k);
            }
            s2+=ch2;
        }
        return s2;
    }
}