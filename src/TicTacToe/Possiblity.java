package TicTacToe;

import java.util.Scanner;
public class Possiblity {
    public boolean Possiblemoves(){
        boolean a,b,c,d,e;
        Scanner in =new Scanner(System.in);
        a = Check(Boardproperties.MOVEROW-1,Boardproperties.MOVECOL);
        b = Check(Boardproperties.MOVEROW+1,Boardproperties.MOVECOL);
        c = Check(Boardproperties.MOVEROW,Boardproperties.MOVECOL-1);
        d = Check(Boardproperties.MOVEROW,Boardproperties.MOVECOL+1);
        if((a||b||c||d)){
            System.out.println("Continue press 0/ Select another seed press 1");
            if(in.nextInt()==0)
                e = true;
            else
                e = false;
            return e;
        }
        else
            return false;
    }
    public boolean Check(int row,int col){
        if(row>=0 && row<Boardproperties.ROWS && col>=0 && col<Boardproperties.COLS && Boardproperties.board[row][col]==Notations.EMPTY){
            row+=1;
            col+=1;
            System.out.println("Possible move "+row+" "+col);
            return true;
        }
        else
            return false;
    }
}
