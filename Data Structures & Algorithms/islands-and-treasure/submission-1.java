class Solution {
    private static final int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++){
                if (grid[r][c] == 0){
                    q.add(new int[]{r, c});

                }
            }
        }
        bfs(grid, q);
    }
        
        private void bfs(int[][] grid, Queue<int[]> q){
            int steps = 0;
            while (!q.isEmpty()){
                int size = q.size();
                steps++;
                for (int i = 0; i < size; i++){
                    int[] curr = q.poll();
                    int n = curr[0];
                    int c = curr[1];
                    for (int[] dir : dirs){
                        int nr = n + dir[0];
                        int nc = c + dir[1]; 
                        if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 2147483647){
                            grid[nr][nc] = steps;
                            q.add(new int[]{nr, nc});
                        }
                    }
                }
            }
    
        }
}
