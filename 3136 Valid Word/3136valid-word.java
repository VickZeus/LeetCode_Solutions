class Solution 
{
    public boolean isValid(String word)
    {
        int count=0;
        boolean vow=false;
        boolean con=false;
        word=word.toLowerCase();

        for(char ch:word.toCharArray())
        {
            
            if(!Character.isLetterOrDigit(ch))return false;
            count++;
            if(Character.isLetter(ch))
            {
                if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
                {
                    vow=true;
                }
                else
                {
                    con=true;
                }
            }
        }

        if(vow && con && count>=3)return true;
        return false;
    }
}