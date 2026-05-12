class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0},
                                               {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        int res = 0;
        int row = grid.length;
        int cols = grid[0].length;
        for (int i = 0;i < row; i++){
            for (int j = 0; j < cols; j++){
                if (grid[i][j]  == '1'){
                    dfs(grid, i, j);
                    res++;
                }

            }
        }
        return res;

        
    }
    private void dfs(char[][] grid, int row, int cols){
        if (row < 0 || cols < 0 || row >= grid.length || cols >= grid[0].length || grid[row][cols] == '0'){
            return;
        }
        grid[row][cols] = '0';
        for (int[] dir : directions){
            dfs(grid, row + dir[0], cols + dir[1]);
        }
    }
}
