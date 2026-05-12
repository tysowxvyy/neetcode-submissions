class Solution {
    private static final int[][] dirs ={{1,0}, {-1, 0}, {0, 1}, {0, -1}};
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int ROWS = grid.length;
        int COLS = grid[0].length;
        for (int r = 0; r < ROWS; r++){
            for (int c = 0; c < COLS; c++){
                if (grid[r][c] == 1){
                    maxArea = Math.max(maxArea, dfs(grid, r, c));
                }
                
            }
    
        }
        return maxArea;        
    }
    private int dfs(int[][] grid, int r, int c){
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length|| grid[r][c] == 0){
            return 0;
        }
        int area = 1;
        grid[r][c] = 0;
        for (int[] dir : dirs){
            area += dfs(grid, r + dir[0], c + dir[1]);
        }
        return area;
    }
}
