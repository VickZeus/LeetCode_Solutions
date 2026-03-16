import java.util.*;
class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                set.add(grid[i][j]);
                for(int k = 1; ; k++){
                    if(i + 2*k >= n || j - k < 0 || j + k >= m)
                        break;
                    int sum = 0;
                    int x = i, y = j;
                    for(int t = 0; t < k; t++)
                        sum += grid[x+t][y+t];

                    for(int t = 0; t < k; t++)
                        sum += grid[x+k+t][y+k-t];

                    for(int t = 0; t < k; t++)
                        sum += grid[x+2*k-t][y-t];

                    for(int t = 0; t < k; t++)
                        sum += grid[x+k-t][y-k+t];
                    set.add(sum);
                }
            }
        }
        int size = Math.min(3, set.size());
        int[] ans = new int[size];

        int idx = 0;
        for(int val : set){
            if(idx == 3) break;
            ans[idx++] = val;
        }

        return ans;
    }
}