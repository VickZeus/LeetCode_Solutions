class Solution {
    public void reverseString(char[] s) 
    {
        int start;
        int end;

        for(start=0;start<s.length/2;start++)
        {
            end=s.length-1-start;
            char k=s[end];
            s[end]=s[start];
            s[start]=k;
        }
    }
}