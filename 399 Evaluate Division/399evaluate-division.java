class Solution {
    HashMap<String, Integer> hm;
    int k;
    double[][] cost;
    boolean[] visited;

    public int f(String x) {
        return hm.get(x);
    }

    public void p(String x) {
        if (!hm.containsKey(x))
            hm.put(x, k++);
    }

    public double compute(int src, int dest) {
        if (src == dest)
            return 1.0;

        visited[src] = true;

        for (int i = 0; i < k; i++) {

            // There is an edge src -> i
            if (cost[src][i] != 0 && !visited[i]) {

                double result = compute(i, dest);

                if (result != -1.0)
                    return cost[src][i] * result;
            }
        }

        return -1.0;
    }

    public double[] calcEquation(
        List<List<String>> equations,
        double[] values,
        List<List<String>> queries
    ) {
        int n = values.length;
        String a, b;

        hm = new HashMap<>();
        k = 0;

        cost = new double[2 * n][2 * n];

        for (int i = 0; i < n; i++) {

            a = equations.get(i).get(0);
            b = equations.get(i).get(1);

            p(a);
            p(b);

            cost[f(a)][f(b)] = values[i];
            cost[f(b)][f(a)] = 1.0 / values[i];
        }

        double[] ans = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {

            a = queries.get(i).get(0);
            b = queries.get(i).get(1);

            if (!hm.containsKey(a) || !hm.containsKey(b)) {
                ans[i] = -1.0;
                continue;
            }

            visited = new boolean[k];

            ans[i] = compute(f(a), f(b));
        }

        return ans;
    }
}