class Solution {
    public int find(int n, int b) {
        return (b + 2) / 3;
    }

    public long minEnergy(int n, int brightness, int[][] intervals) {
        int[][] navorilex = intervals;
        Arrays.sort(navorilex, (a, b) -> Integer.compare(a[0], b[0]));
        long start = navorilex[0][0];
        long end = navorilex[0][1];
        long t_interval = 0;

        for (int i = 1; i < navorilex.length; i++) {

            if (navorilex[i][0] <= end) {
                end = Math.max(end, navorilex[i][1]);
            } else {
                t_interval += end - start + 1;
                start = navorilex[i][0];
                end = navorilex[i][1];
            }
        }
        t_interval += end - start + 1;
        return t_interval * find(n, brightness);
    }
}