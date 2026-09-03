class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int n = nums1.length;
        int odd = 0, even = 0;
        if (n < 2)return true;

        boolean ePrior = true;
        boolean oPrior = true;
        boolean[][] dp = new boolean[2][n];

        for (int i = 0; i < n; i++) {
            if (nums1[i] % 2 == 0)
                dp[0][i] = true;
            else
                dp[1][i] = true;
            if (nums1[i] % 2 == 0) {
                if (even > 0)
                    dp[0][i] = true;
                if (odd > 0)
                    dp[1][i] = true;
            } else {
                if (odd > 0)
                    dp[0][i] = true;
                if (even > 0)
                    dp[1][i] = true;
            }
            ePrior = ePrior && dp[0][i];
            oPrior = oPrior && dp[1][i];
            if (nums1[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        return ePrior || oPrior;
    }
}