class Solution {

    private static final int[][] DIR = {{0,1},{0,-1},{1,0},{-1,0}};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int fresh = 0;

        // Initialization: count fresh oranges & enqueue rotten ones
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) fresh++;
                if (grid[r][c] == 2) q.offer(new int[]{r, c});
            }
        }

        int time = bfs(grid, q, fresh);
        return time;
    }

    private int bfs(int[][] grid, Queue<int[]> q, int fresh) {
        int time = 0;

        while (fresh > 0 && !q.isEmpty()) {
            int size = q.size(); // one "minute"

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                for (int[] d : DIR) {
                    int nr = r + d[0];
                    int nc = c + d[1];

                    if (nr >= 0 && nr < grid.length &&
                        nc >= 0 && nc < grid[0].length &&
                        grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        q.offer(new int[]{nr, nc});
                        fresh--;
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
    }
}