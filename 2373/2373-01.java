class Solution {
    public int[][] largestLocal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] res = new int[m - 2][n - 2];
        int v1, v2, v3;
        
        for (int r = 0; r <= m - 3; r++) {
            v1 = v2 = v3 = 0;
            
            for (int c = 0; c <= n -3; c++) {
                v1 = Math.max(grid[r][c], Math.max(grid[r][c + 1], grid[r][c + 2]));
                v2 = Math.max(grid[r + 1][c], Math.max(grid[r + 1][c + 1], grid[r + 1][c + 2]));
                v3 = Math.max(grid[r + 2][c], Math.max(grid[r + 2][c + 1], grid[r + 2][c + 2]));
                
                res[r][c] = Math.max(v1, Math.max(v2, v3));
            }
        }
        
        return res;
    }
}
