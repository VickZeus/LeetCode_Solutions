class Solution:
    def satisfiesConditions(self, grid: List[List[int]]) -> bool:
        m=len(grid)
        n=len(grid[0])
        boolean=True
        for i in range(m) :
            for j in range(n) :
                if i+1<m : #Equal to cell below it or not
                    if grid[i][j]!=grid[i+1][j] :
                        boolean=False
                        break
                if j+1<n : #Equal to cell left of it or not
                    if grid[i][j]==grid[i][j+1] :
                        boolean=False
                        break
        return boolean