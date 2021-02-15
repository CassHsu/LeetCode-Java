class Solution {
    private final static int W = '0';
    private final static int L = '1';
    private static int ROW;
    private static int COL;
    
    public int numIslands(char[][] grid) {
        ROW = grid.length;
        if (ROW <= 0) return 0;
        
        COL = grid[0].length;
        int islands = 0;
        
        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (grid[r][c] == L) {
                    islands++;
                    dfs(grid, r, c);
                }
            }
        }
        
        return islands;
    }
    
    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= ROW || c >= COL || grid[r][c] != L) return;
        
        grid[r][c] = W;
        dfs(grid, r+1, c);
        dfs(grid, r, c+1);
        dfs(grid, r-1, c);
        dfs(grid, r, c-1);
    }
}