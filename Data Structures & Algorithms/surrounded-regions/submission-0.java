class Solution {
    private static final int[][] dir = {{1,0}, {-1, 0}, {0,1}, {0,-1}};
    public void solve(char[][] board) {
        int ROWS = board.length;
        int COLS = board[0].length;
        for (int r = 0; r < ROWS; r++){
            for (int c = 0; c < COLS; c++){
                if (board[r][c] == 'O' && (r == 0 || c == 0 || r == ROWS-1 || c == COLS-1)){
                    dfs(board, r, c);
                }
            }
         }
         for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLS; j++){
                if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if (board[i][j] == 'S'){
                    board[i][j] = 'O';
                } 
            }
         }
    }
    
    private void dfs(char[][] board, int r, int c){
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != 'O'){
            return;
        }
        board[r][c] = 'S';
        // count variable for amount of 0
        for (int[] dirs : dir){
            //loop through dirs
            int nr = r + dirs[0];
            int nc = c + dirs[1];
            if (nr >= 0 && nc >= 0 && nr < board.length && nc < board[0].length){
                dfs(board, nr, nc);

            }
        }
    }
}

    
    
/**

1: loop through board and check if board[r][c] == '0'
2: if so, we call dfs function on it




**/