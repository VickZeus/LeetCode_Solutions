class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n = s.length(), m = t.length();

        if (n > m) return false;

        int[] left = new int[n];
        int[] right = new int[n];

        int j = 0;
        for (int i = 0; i < n; i++) {
            while (j < m && s.charAt(i) != t.charAt(j)) j++;
            left[i] = j;
            if (j < m) j++;
        }
        if (left[n - 1] < m) return true;
        j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (j >= 0 && s.charAt(i) != t.charAt(j)) j--;
            right[i] = j;
            if (j >= 0) j--;
        }

        for (int i = 0; i < n; i++) {

            int L = (i == 0) ? -1 : left[i - 1];
            int R = (i == n - 1) ? m : right[i + 1];

            if (L + 1 < R) {
                return true;
            }
        }

        return false;
    }
}