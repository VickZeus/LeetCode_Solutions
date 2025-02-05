class Solution 
{
    public boolean areAlmostEqual(String s1, String s2) 
    {
        if(s1.length()!=s2.length())return false;
        
        int[] freq=new int[123];
        for(int i=0;i<s1.length();i++)
        {
            freq[(int)s1.charAt(i)]+=1;
            freq[(int)s2.charAt(i)]-=1;
        }

        for(int i:freq)
        {
            if(i!=0)return false;
        }

        
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))count++;
            if(count>2)return false;
        }    
        if(count==1)return false;
        return true;
    }
}