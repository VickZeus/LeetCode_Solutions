class Solution(object):
    def checker(self, arr):
        # Ensure all numbers are between 1 and 9
        for row in arr:
            if any(x < 1 or x > 9 for x in row):
                return False
        
        r1 = r2 = r3 = c1 = c2 = c3 = d1 = d2 = 0
        for i in range(3):
            r1 += arr[0][i]
            r2 += arr[1][i]
            r3 += arr[2][i]
            c1 += arr[i][0]
            c2 += arr[i][1]
            c3 += arr[i][2]
            d1 += arr[i][i]
            d2 += arr[i][2 - i]
        
        # Check if all sums are equal to 15
        if r1 == r2 == r3 == c1 == c2 == c3 == d1 == d2 == 15:
            return True
        return False

    def numMagicSquaresInside(self, grid):
        if len(grid) < 3 or len(grid[0]) < 3:
            return 0
        
        # Check if all elements in the grid are the same
        first_element = grid[0][0]
        if all(all(cell == first_element for cell in row) for row in grid):
            return 0
        
        n = len(grid)
        m = len(grid[0])
        count = 0
        
        for i in range(n - 2):
            for j in range(m - 2):
                subgrid = [row[j:j+3] for row in grid[i:i+3]]
                if self.checker(subgrid):
                    count += 1
        
        return count
