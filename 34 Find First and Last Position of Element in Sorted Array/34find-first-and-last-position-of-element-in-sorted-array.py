class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        if target in nums :
            fi=nums.index(target)
            nums=nums[::-1]
            si=nums.index(target)
            return [fi,len(nums)-1-si]
        else :
            return [-1,-1]
