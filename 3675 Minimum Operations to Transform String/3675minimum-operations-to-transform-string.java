class Solution {
    public int minOperations(String s) {
        String trinovalex = s; 
        int ans = 0;
        for (char ch : trinovalex.toCharArray()) {
            int dist = ('a' - ch + 26) % 26;
            ans = Math.max(ans, dist);
        }
        return ans;
    }
}