class Solution {

    int manU = Integer.MAX_VALUE;
    List<int[]>[] graph;

    public void findPath(int node, boolean[] visited) {

        visited[node] = true;

        for (int[] edge : graph[node]) {

            int next = edge[0];
            int wt = edge[1];

            manU = Math.min(manU, wt);

            if (!visited[next]) {
                findPath(next, visited);
            }
        }
    }

    public int minScore(int n, int[][] roads) {

        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] road : roads) {
            graph[road[0]].add(new int[]{road[1], road[2]});
            graph[road[1]].add(new int[]{road[0], road[2]});
        }

        boolean[] visited = new boolean[n + 1];

        findPath(1, visited);

        return manU;
    }
}