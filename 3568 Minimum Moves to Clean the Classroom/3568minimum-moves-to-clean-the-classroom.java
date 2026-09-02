import java.util.*;
class Solution {
    static class State {
        int r, c, mask, energy;
        State(int r, int c, int mask, int energy) {
            this.r = r;
            this.c = c;
            this.mask = mask;
            this.energy = energy;
        }
    }
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int sr = -1, sc = -1;
        int[][] litterId = new int[m][n];
        for (int[] row : litterId) {
            Arrays.fill(row, -1);
        }
        int litterCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);
                if (ch == 'S') {
                    sr = i;
                    sc = j;
                }
                if (ch == 'L') {
                    litterId[i][j] = litterCount++;
                }
            }
        }
        int targetMask = (1 << litterCount) - 1;
        if (targetMask == 0) {
            return 0;
        }
        boolean[][][][] visited =
            new boolean[m][n][1 << litterCount][energy + 1];

        Queue<State> queue = new LinkedList<>();

        queue.offer(new State(sr, sc, 0, energy));
        visited[sr][sc][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {
                State cur = queue.poll();

                if (cur.mask == targetMask) {
                    return moves;
                }

                if (cur.energy == 0) {
                    continue;
                }

                for (int d = 0; d < 4; d++) {

                    int nr = cur.r + dr[d];
                    int nc = cur.c + dc[d];

                    if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                        continue;
                    }

                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    int newEnergy = cur.energy - 1;
                    int newMask = cur.mask;

                    char next = classroom[nr].charAt(nc);
                    if (next == 'L') {
                        int id = litterId[nr][nc];
                        newMask |= (1 << id);
                    }
                    if (next == 'R') {
                        newEnergy = energy;
                    }

                    if (!visited[nr][nc][newMask][newEnergy]) {

                        visited[nr][nc][newMask][newEnergy] = true;

                        queue.offer(
                            new State(nr, nc, newMask, newEnergy)
                        );
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}