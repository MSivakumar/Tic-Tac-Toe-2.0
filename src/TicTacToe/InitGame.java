package TicTacToe;

public class InitGame {
    public void InitGame(){
        for (int row = 0; row < Boardproperties.ROWS; ++row) {
            for (int col = 0; col < Boardproperties.COLS; ++col) {
                Boardproperties.board[row][col] = Notations.EMPTY;
            }
        }
        Boardproperties.currentState = Statusproperties.PLAYING;
        Boardproperties.currentPlayer = (Boardproperties.currentPlayer == Notations.CROSS) ? Notations.NOUGHT : Notations.CROSS;
    }
}
