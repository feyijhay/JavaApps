package TicTacToeApp;

public class Player {
    private int playerId;
    private Board playerInitial = Board.EMPTY;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public Player(int playerId) throws InvalidPlayerException {
        this.playerId  = playerId;
        setPlayerInitial(playerId);

    }
    public Board getPlayerInitial(){
        return playerInitial;
    }

    public void setPlayerInitial(int playerId) throws InvalidPlayerException {
        if (playerId < 0 || playerId > 2) throw new InvalidPlayerException("Player can only be 2");
        if (playerId == 1)this.playerInitial=Board.X;
        if (playerId == 2)this.playerInitial=Board.O;
    }

    public void play(TicTacToe ticTacToe, int row, int column){
        ticTacToe.getTicTacToeBoard()[row][column] = this.playerInitial;

    }



}
