package TicTacToe;

public class Controller {
    Move move = new Move();
    Update update = new Update();
    public void Move(Profile p, int index){
        move.playerMove(p,Boardproperties.currentPlayer,index);
        update.updateGame(Boardproperties.currentPlayer, Boardproperties.currntRow, Boardproperties.currentCol);
        Boardproperties.currentPlayer = (Boardproperties.currentPlayer == Notations.CROSS) ? Notations.NOUGHT : Notations.CROSS;
        if (Boardproperties.currentState == Statusproperties.CROSS_WON) {
            System.out.println("'"+p.player+"' won!");
            p.wincount++;
        } else if (Boardproperties.currentState == Statusproperties.NOUGHT_WON) {
            System.out.println("'"+p.player+"' won!");
            p.wincount++;
        }
    }
    public void Move(Profile p){
        move.playerMove(Boardproperties.currentPlayer,p);
        update.updateGame(Boardproperties.currentPlayer, Boardproperties.currntRow, Boardproperties.currentCol);
        Boardproperties.currentPlayer = (Boardproperties.currentPlayer == Notations.CROSS) ? Notations.NOUGHT : Notations.CROSS;
        if (Boardproperties.currentState == Statusproperties.CROSS_WON) {
            System.out.println("'"+p.player+"' won!");
            p.wincount++;
        } else if (Boardproperties.currentState == Statusproperties.NOUGHT_WON) {
            System.out.println("'"+p.player+"' won!");
            p.wincount++;
        }
    }
}
