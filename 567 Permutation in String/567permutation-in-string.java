class Solution 
{
    public int checker(String s1,String s2)
    {
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);Arrays.sort(ch2);
        s1=new String(ch1);s2=new String(ch2);
        if(s1.equals(s2))return 0;
        return -1;
    }
    public boolean checkInclusion(String s1, String s2) 
    {
        //StringBuilder obj;    
        int i=0;
        int j=s1.length();
        int len=s2.length();
        while(j<=len)
        {
            //obj=new StringBuilder("");
            String s=s2.substring(i,j);
            //obj.append(s);
            //String rev=obj.reverse().toString();
            if(checker(s,s1)==0)return true;
            //System.out.println(s+" "+rev);
            i++;j++;
        }    
        return false;
    }
}