class Solution:
    def reverse(self, x: int) -> int:
        k=1
        if x<0 : 
            k=-1
            x=x*-1
        num=int(str(x)[::-1])*k
        if num>2**31-1 or num<-2**31 :
            return 0  
        else :
            return num