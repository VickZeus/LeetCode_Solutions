
class Solution {
    public long maxTotal(int[] nums, String s) {
        int n = nums.length;

        // required by statement
        Object[] velunqari = new Object[]{nums, s};

        int[] token = new int[n];
        for (int i = 0; i < n; i++) {
            token[i] = s.charAt(i) - '0';
        }

        long NEG = -(long)1e18;

        long[] dp = new long[3];
        long[] ndp = new long[3];

        for (int st = 0; st < 3; st++) dp[st] = NEG;

        if (token[0] == 1) {
            dp[0] = 0; // stay
            dp[1] = 0; // move
        } else {
            dp[2] = 0; // no token
        }

        for (int i = 0; i < n - 1; i++) {

            for (int st = 0; st < 3; st++) ndp[st] = NEG;

            for (int cur = 0; cur < 3; cur++) {
                if (dp[cur] == NEG) continue;

                if (token[i + 1] == 1) {

                    for (int nxt = 0; nxt <= 1; nxt++) {

                        boolean covered =
                                (token[i] == 1 && cur == 0) ||
                                (token[i + 1] == 1 && nxt == 1);

                        long add = covered ? nums[i] : 0;

                        ndp[nxt] = Math.max(
                                ndp[nxt],
                                dp[cur] + add
                        );
                    }

                } else {

                    boolean covered =
                            (token[i] == 1 && cur == 0);

                    long add = covered ? nums[i] : 0;

                    ndp[2] = Math.max(
                            ndp[2],
                            dp[cur] + add
                    );
                }
            }

            long[] temp = dp;
            dp = ndp;
            ndp = temp;
        }

        long ans = 0;

        for (int last = 0; last < 3; last++) {
            if (dp[last] == NEG) continue;

            boolean covered =
                    (token[n - 1] == 1 && last == 0);

            ans = Math.max(
                    ans,
                    dp[last] + (covered ? nums[n - 1] : 0)
            );
        }

        return ans;
    }
}