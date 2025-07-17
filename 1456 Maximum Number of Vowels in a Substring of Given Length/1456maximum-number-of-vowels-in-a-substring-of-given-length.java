class Solution 
{
    public boolean check(char ch)
    {
        if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))return true;
        return false;
    }

    public int maxVowels(String s, int k) 
    {
        if(s.length()==1 && check(s.charAt(0)))return 1;
        int start=0,end=k-1;
        int max=0;
        for(int i=0;i<=end;i++)
        {
            if(check(s.charAt(i)))max++;
        }
        int fmax=max;
        while(end<s.length()-1)
        {
            if(check(s.charAt(start)))max--;
            if(check(s.charAt(++end)))max++;
            fmax=Math.max(fmax,max);
            start++;
        }
        return fmax;
    }
}