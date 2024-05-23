class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s=s.strip()
        s2=s.split(' ')
        return len(s2[-1])
