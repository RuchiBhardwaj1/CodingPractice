package dp;

public class tictactoe {

//    public String tictactoe1(int[][] moves) {
//
//        if(moves.length < 5) return "Pending";
//
//        int[][] board = new int[3][3];
//
//        int player = 0;
//
//        for(int i=0;i<moves.length;i++){
//
//            int x = moves[i][0];
//            int y = moves[i][1];
//            player = (i % 2 == 0 ? 1 :2);
//
//            board[x][y] = player;
//
//            if(isWinner(board,player)){
//                return (player == 1 ? "A" : "B");
//            }
//        }
//
//        return moves.length == 9 ? "Draw" : "Pending";
//    }
//
//    private boolean isWinner(int[][] b, int player){
//
//        if(b[0][0] ==player && b[0][1] == player && b[0][2] == player) return true;
//        if(b[1][0] ==player && b[1][1] == player && b[1][2] == player) return true;
//        if(b[2][0] ==player && b[2][1] == player && b[2][2] == player) return true;
//
//        if(b[0][0] ==player && b[1][0] == player && b[2][0] == player) return true;
//        if(b[0][1] ==player && b[1][1] == player && b[2][1] == player) return true;
//        if(b[0][2] ==player && b[1][2] == player && b[2][2] == player) return true;
//
//        if(b[0][0] ==player && b[1][1] == player && b[2][2] == player) return true;
//        if(b[0][2] ==player && b[1][1] == player && b[2][0] == player) return true;
//
//        return false;
//    }

    public static String tictactoe1(int[][] moves) {

        char[][] grid = playAll(moves);

        for(int i=0; i<grid.length; i++) {
            if(grid[i][0] == grid[i][1] && grid[i][0] == grid[i][2] && grid[i][0] != '.') {
                if(grid[i][0]=='X')
                    return "A";
                else return "B";
            }
            if(grid[0][i] == grid[1][i] && grid[0][i] == grid[2][i] && grid[0][i] != '.') {
                if(grid[0][i]=='X')
                    return "A";
                else return "B";
            }
        }

        if(grid[1][1]!='.') {
            if(grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2] && grid[0][0] != '.') {
                if(grid[0][0]=='X')
                    return "A";
                else return "B";
            }

            if(grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0] && grid[0][2] != '.') {
                if(grid[0][2]=='X')
                    return "A";
                else return "B";
            }
        }

        return moves.length == 9 ? "Draw" : "Pending";



    }

    public static char[][] playAll(int[][] moves){
        char[][] grid = {{'.', '.', '.'},{'.', '.', '.'},{'.', '.', '.'}};
        boolean turnA = true;
        for(int[] move : moves) {
            if(turnA)
                grid[move[0]][move[1]] = 'X';
            else
                grid[move[0]][move[1]] = '0';
            turnA = !turnA;
        }
        return grid;

    }

    public static void main(String[] args) {

        int[][] moves = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        tictactoe ti = new tictactoe();
        System.out.println(ti.tictactoe1(moves));
    }
}
