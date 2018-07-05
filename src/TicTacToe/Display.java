package TicTacToe;

public class Display {
    public void DisplayBoard(Profile p1,Profile p2,int index) {
        for (int row = 0; row < Boardproperties.ROWS; ++row) {
            for (int col = 0; col < Boardproperties.COLS; ++col) {
                printCell(Boardproperties.board[row][col],p1,p2); // print each of the cells
                if (col != Boardproperties.COLS - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row != Boardproperties.ROWS - 1) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

    private void printCell(int content,Profile p1,Profile p2) {
        switch (content) {
            case Notations.EMPTY:  System.out.print("   "); break;
            case Notations.NOUGHT: System.out.print(" "+p2.symbol+" "); break;
            case Notations.CROSS:  System.out.print(" "+p1.symbol+" "); break;
        }
    }
}
