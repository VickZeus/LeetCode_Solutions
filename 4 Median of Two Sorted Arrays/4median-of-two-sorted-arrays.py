class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        l=nums1+nums2
        l.sort()
        k=len(l)
        if k%2==0 :
            return (l[k//2]+l[(k//2)-1])/2
        else : 
            return float(l[k//2])
