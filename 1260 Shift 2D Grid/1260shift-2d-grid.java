class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;

        int total = row * col;
        k %= total;

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < col; j++) {
                int currentIndex = i * col + j;

                int sourceIndex = (currentIndex - k + total) % total;

                int sourceRow = sourceIndex / col;
                int sourceCol = sourceIndex % col;

                temp.add(grid[sourceRow][sourceCol]);
            }

            ans.add(temp);
        }

        return ans;
    }
}