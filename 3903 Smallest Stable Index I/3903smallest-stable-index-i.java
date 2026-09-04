class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) return k >= 0 ? 0 : -1;

        int[] maxN = new int[n];
        int[] minN = new int[n];

        maxN[0] = nums[0];

        for (int i = 1; i < n; i++) {
            maxN[i] = Math.max(maxN[i - 1], nums[i]);
        }

        minN[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            minN[i] = Math.min(minN[i + 1], nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (maxN[i] - minN[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}