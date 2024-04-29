class Solution:
    def longestPalindrome(self, s: str) -> str:
        smax=""
        for i in range(0,len(s)) :
            s1=""
            for j in range(i,len(s)) :
                s1+=s[j]
                if s1[::-1]==s1 and len(s1)>len(smax) :
                    smax=s1
        return smax

        