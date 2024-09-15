class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        l=[]
        for i in s :
            if i in "aeiouAEIOU" :
                l.append(i)
        s2=""
        j=len(l)-1
        for k in s :
            if k in "aeiouAEIOU" :
                s2+=l[j] 
                j=j-1
            else :
                s2+=k
        return s2

        