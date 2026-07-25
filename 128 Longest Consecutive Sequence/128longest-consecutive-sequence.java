class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int longest=0,curr=0,currl=0;

        for(int k:nums)hs.add(k); // O(n)

        for(int k:hs){
            if(!hs.contains(k-1)){
                curr=k;
                currl=1;
                while(hs.contains(curr+1)){
                    curr++;
                    currl++;
                }
                longest=Math.max(longest,currl);
            }
        }

        return longest;
    }
}