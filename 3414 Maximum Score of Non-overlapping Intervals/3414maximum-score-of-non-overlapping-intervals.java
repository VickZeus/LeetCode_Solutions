class Solution {

    class Node {
        int l, r, w, idx;

        Node(int l, int r, int w, int idx) {
            this.l = l;
            this.r = r;
            this.w = w;
            this.idx = idx;
        }
    }

    class State {
        long score;
        List<Integer> list;

        State(long score, List<Integer> list) {
            this.score = score;
            this.list = list;
        }
    }

    Node[] arr;
    int[] next;
    State[][] dp;

    public State solve(int i, int k) {

        if (i == arr.length || k == 0)
            return new State(0, new ArrayList<>());

        if (dp[i][k] != null)
            return dp[i][k];

        // Skip
        State skip = solve(i + 1, k);

        // Take
        State temp = solve(next[i], k - 1);

        List<Integer> takeList = new ArrayList<>();
        takeList.add(arr[i].idx);
        takeList.addAll(temp.list);

        Collections.sort(takeList);

        State take = new State(
            arr[i].w + temp.score,
            takeList
        );

        if (take.score > skip.score) {
            dp[i][k] = take;
        }
        else if (take.score < skip.score) {
            dp[i][k] = skip;
        }
        else {
            dp[i][k] = lexSmaller(take.list, skip.list)
                    ? take
                    : skip;
        }

        return dp[i][k];
    }

    public boolean lexSmaller(List<Integer> a, List<Integer> b) {

        int n = Math.min(a.size(), b.size());

        for (int i = 0; i < n; i++) {

            if (!a.get(i).equals(b.get(i)))
                return a.get(i) < b.get(i);
        }

        return a.size() < b.size();
    }

    public int findNext(int i) {

        int lo = i + 1;
        int hi = arr.length;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            if (arr[mid].l > arr[i].r)
                hi = mid;
            else
                lo = mid + 1;
        }

        return lo;
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        arr = new Node[n];

        for (int i = 0; i < n; i++) {

            arr[i] = new Node(
                intervals.get(i).get(0),
                intervals.get(i).get(1),
                intervals.get(i).get(2),
                i
            );
        }

        // Sort by left endpoint
        Arrays.sort(arr, (a, b) -> {
            if (a.l != b.l)
                return Integer.compare(a.l, b.l);

            return Integer.compare(a.idx, b.idx);
        });

        // Find next non-overlapping interval
        next = new int[n];

        for (int i = 0; i < n; i++)
            next[i] = findNext(i);

        // dp[i][k] = best answer from i using at most k intervals
        dp = new State[n][5];

        State ans = solve(0, 4);

        Collections.sort(ans.list);

        int[] result = new int[ans.list.size()];

        for (int i = 0; i < ans.list.size(); i++)
            result[i] = ans.list.get(i);

        return result;
    }
}