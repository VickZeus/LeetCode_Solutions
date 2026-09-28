class Solution {
    public int maxDepth(String s) {
        int maxN=Integer.MIN_VALUE,locN=0;
        for(char ch:s.toCharArray()){
            if(ch=='(')locN++;
            if(ch==')')locN--;
            maxN=Math.max(maxN,locN);
        }
        return maxN;
    }
}