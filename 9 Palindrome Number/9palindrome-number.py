class Solution:
    def isPalindrome(self, x: int) -> bool:
            if ("+" in str(x)) or ("-" in str(x)) :
                return False
            else :
                if str(x)==str(x)[::-1] :
                    return True
                else :
                    return False
