class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        StringBuilder obj=new StringBuilder("");
        int i=0;
        while(i<word1.length() && i<word2.length())
        {
            obj.append(word1.charAt(i));
            obj.append(word2.charAt(i));
            i++;
        }  
        int j=i;
        while(j<word1.length())
        {
            obj.append(word1.charAt(j));
            j++;
        }
        while(i<word2.length())
        {
            obj.append(word2.charAt(i));
            i++;
        }
        return obj.toString();
    }
}