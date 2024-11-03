class Solution(object):
    def rotateString(self, s, goal):
        """
        :type s: str
        :type goal: str
        :rtype: bool
        """
        if(len(s)!=len(goal)) : return False
        s=s*3
        if(goal in s):return True
        return False
        