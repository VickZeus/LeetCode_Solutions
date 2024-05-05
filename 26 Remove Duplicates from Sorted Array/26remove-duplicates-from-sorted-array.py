class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        k=list(set(nums))
        k.sort()
        for i in range(len(k)) :
            nums[i]=k[i]
        return len(k)


