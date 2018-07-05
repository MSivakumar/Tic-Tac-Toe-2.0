package TicTacToe;

public class Update {
    public void updateGame(int theSeed, int currentRow, int currentCol) {
        if (hasWon(theSeed, currentRow, currentCol)) {
            Boardproperties.currentState = (theSeed == Notations.CROSS) ? Statusproperties.CROSS_WON : Statusproperties.NOUGHT_WON;
        }
    }
    public boolean hasWon(int theSeed, int currentRow, int currentCol) {
        return (Boardproperties.board[currentRow][0] == theSeed && Boardproperties.board[currentRow][1] == theSeed && Boardproperties.board[currentRow][2] == theSeed
                || Boardproperties.board[0][currentCol] == theSeed && Boardproperties.board[1][currentCol] == theSeed && Boardproperties.board[2][currentCol] == theSeed
                || currentRow == currentCol && Boardproperties.board[0][0] == theSeed && Boardproperties.board[1][1] == theSeed && Boardproperties.board[2][2] == theSeed
                || currentRow + currentCol == 2 && Boardproperties.board[0][2] == theSeed && Boardproperties.board[1][1] == theSeed && Boardproperties.board[2][0] == theSeed);
    }
}
