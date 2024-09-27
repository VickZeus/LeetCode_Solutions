class Solution {
    public String gcdOfStrings(String str1, String str2) 
    {
        StringBuilder obj=new StringBuilder("");
        String k="";
        String s=(str1.length()>str2.length())?str2:str1; // Getting the smallest string 
        String sl=(s.equals(str1))?str2:str1;// Getting The larger String.
        for(int i=0;i<s.length();i++)
        {
            obj.append(s.charAt(i));
            if(sl.split(obj.toString()).length==0 && s.split(obj.toString()).length==0 &&obj.toString().length()>k.length())
            {
                k=obj.toString();
            }
        }
        if(k.length()!=0)return k;
        return "";
    }
}