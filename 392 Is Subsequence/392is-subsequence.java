class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        if(s.length()>t.length())return false;
        if(s.length()==0)return true;
        //if(s.charAt(0)!=t.charAt(0))return false;
        int count=0;
        
        int i=0;;
        for(char ch:t.toCharArray())
        {
            if(ch==s.charAt(i))
            {
                count++;
                i++;
                if(i>s.length()-1)break;
            }
        }
        if(count==s.length())return true;
        return false;
    }
}