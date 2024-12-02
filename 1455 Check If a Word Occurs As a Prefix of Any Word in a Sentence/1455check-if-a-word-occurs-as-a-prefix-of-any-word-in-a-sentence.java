class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) 
    {
        int k=0;
        int j=0;
        sentence=' '+sentence;
        for(int i=0;i<sentence.length();i++)
        {
            if(sentence.charAt(i)==' ')k++;

            if(sentence.charAt(i)==searchWord.charAt(0) && (sentence.charAt(i-1)==' '))
            {
                boolean flag=true;int h=i;
                for(j=0;j<searchWord.length();j++)
                {
                    if(h==sentence.length())return -1;
                    if(sentence.charAt(h++)!=searchWord.charAt(j))
                    {
                        
                        flag=false;
                        break; 
                    }
                }
                if(flag)return k;
            }
        } 
        return -1;   
    }
}