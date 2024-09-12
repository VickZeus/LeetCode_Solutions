class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        count=0
        for i in words :
            flag=True
            for k in i :
                if k not in allowed : 
                    flag=False
                    break
            if flag :
                count+=1
        return count 
