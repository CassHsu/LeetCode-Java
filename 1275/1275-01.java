class Solution {
    private char[][] board;
    private char pa = 'A';
    private char pb = 'B';
    private char turn = pa;
    
    public String tictactoe(int[][] moves) {
        if (moves.length < 5) return "Pending";
        
        board = new char[3][3];
        init();
        
        for (int i = 0; i < moves.length; i++) {
            board[moves[i][0]][moves[i][1]] = turn;
            
            if (isWin()) return "" + turn;
            
            turn = (turn == pa) ? pb : pa;
        }
        
        if (isDraw()) return "Draw";
        return "Pending";
    }
    
    private void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        } 
    }
    
    private boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }
    
    private boolean isWin() {
        if (board[1][1] == turn) {
            if (board[0][0] == turn && board[2][2] == turn) return true;
            if (board[0][2] == turn && board[2][0] == turn) return true;
        }
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == turn && board[i][1] == turn && board[i][2] == turn) return true;
            if (board[0][i] == turn && board[1][i] == turn && board[2][i] == turn) return true;
        }
        
        return false;
    }
}
