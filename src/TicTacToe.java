import TicTacToe.*;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        InitGame initgame = new InitGame();
        int temp=0;
        Boardproperties.currentPlayer = Notations.NOUGHT;
        initgame.InitGame();
        Profile player1 = new Profile();
        Profile player2 = new Profile();
        Controller controller = new Controller();
        Display display = new Display();
        System.out.println("Enter player1 name");
        player1.player = in.next();
        System.out.println("Enter player2 name");
        player2.player = in.next();
        System.out.println("Symbol for "+player1.player);
        player1.symbol = in.next().charAt(0);
        System.out.println("Symbol for "+player2.player);
        player2.symbol = in.next().charAt(0);
        while (temp==0) {
            for (int i = 0; i < 6; i++) {
                if(Boardproperties.currentPlayer == Notations.CROSS)
                    controller.Move(player1, i/2);
                else
                    controller.Move(player2, i/2);
                display.DisplayBoard(player1, player2, i);
                if (Boardproperties.currentState != Statusproperties.PLAYING)
                    break;
            }
            while (Boardproperties.currentState == Statusproperties.PLAYING) {
                if(Boardproperties.currentPlayer == Notations.CROSS)
                    controller.Move(player1);
                else
                    controller.Move(player2);
                display.DisplayBoard(player1, player2, 2);
                if (Boardproperties.currentState != Statusproperties.PLAYING)
                    break;
            }
            System.out.println(player1.player+" "+player1.wincount);
            System.out.println(player2.player+" "+player2.wincount);
            System.out.print("Do you want to continue press 0/quit press 1 : ");
            temp=in.nextInt();
            if(temp==0)
                initgame.InitGame();
        }
        if(player1.wincount>player2.wincount)
            System.out.println("*** "+player1.player+" won the match ***");
        else if(player1.wincount==player2.wincount)
            System.out.println("*** Match was Draw! ***");
        else
            System.out.println("*** "+player2.player+" won the match ***");
        System.out.println("Bye!");
    }
}