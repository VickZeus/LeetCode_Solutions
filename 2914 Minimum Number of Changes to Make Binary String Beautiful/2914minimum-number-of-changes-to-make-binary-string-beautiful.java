class Solution {
    public int minChanges(String s)
    {
        int n=s.length();
        if(n%2!=0)return -1;

        int count1=0,op=0;
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(ch==s.charAt(i))
            {
                count1++;continue;
            }
            if(count1%2!=0)
            {
                op++;
                count1=0;
            }
            else
            {
                count1=1;
            }
            ch=s.charAt(i);
        }
        return op;
    }
}