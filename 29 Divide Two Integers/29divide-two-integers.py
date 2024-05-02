class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        k=dividend/divisor
        if k>(2**31-1) :
            return 2**31-1
        elif k<(-2**31) :
            return -2**31
        else :
            return int(k)