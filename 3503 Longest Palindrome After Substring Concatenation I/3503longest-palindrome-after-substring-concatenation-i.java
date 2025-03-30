class Solution 
{

    public HashSet<String> generate(String s)
    {
        HashSet<String> ans=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            StringBuilder k=new StringBuilder("");
            for(int j=i;j<s.length();j++)
            {
                 k.append(s.charAt(j)); 
                 ans.add(k.toString());
            }
        }
        return ans;
    }

    public int check(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
             if(s.charAt(left)!=s.charAt(right))return -1;
             right--;
             left++;
        }
        return s.length();
    }
    
    public int longestPalindrome(String s, String t) 
    {
        if(s.length()==0 && t.length()==0)return 0;
        HashSet<String> s1=generate(s);
        HashSet<String> s2=generate(t);

        int max=1;

        for(String s11:s1)
        {
            for(String s22:s2)
            {
                int n=check(s11+s22);
                if(n>max)
                {
                    max=n;
                }
            }
        }

        for(String s11:s1)
        {
           if(check(s11)>max)max=s11.length();     
        }

        for(String s22:s2)
        {
           if(check(s22)>max)max=s22.length();     
        }

        max=(max>check(s))?max:s.length();
        max=(max>check(t))?max:t.length();
        return max;
    }
}