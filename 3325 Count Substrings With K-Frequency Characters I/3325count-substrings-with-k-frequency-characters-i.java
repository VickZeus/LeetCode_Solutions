class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n = s.length();
        int count = 0;

        for (int left = 0; left < n; left++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int right = left; right < n; right++) {
                freq[s.charAt(right) - 'a']++;
                maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'a']);

                if (maxFreq >= k) {
                    count += n - right;
                    break;
                }
            }
        }
        return count;
    }
}