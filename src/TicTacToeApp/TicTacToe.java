package TicTacToeApp;

public class TicTacToe{


   private  Board[][] ticTacToeBoard = new Board[1][1];


    public TicTacToe() {
        for (int check = 0; check<ticTacToeBoard.length; check++){
            for (int check1 = 0; check1<ticTacToeBoard[check].length; check1++){
                ticTacToeBoard[check][check1] = Board.EMPTY;
            }
        }
    }

    public Board[][] getTicTacToeBoard(){
       return ticTacToeBoard;
    }

    public void displayBoard(){
        for (int i = 0; i < getTicTacToeBoard().length ; i++) {
            for (int j = 0; j < getTicTacToeBoard()[i].length; j++) {
                System.out.println(getTicTacToeBoard()[i][j]);
            }
            System.out.println();

        }
    }
}