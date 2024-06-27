package ku.cs.se;
//6510450691 Podjanin Wachirawittayakul
import java.util.ArrayList;

public class MGame {
    private int roundCount;
    private ArrayList<Player> players;
    private ArrayList<Dice> dices;
    private Board board;
    private int n;

    public MGame() {
    }

    public MGame(ArrayList<Player> players, int n, ArrayList<Dice> dices, Board board) {
        try {
            if (players.size() >= 2 && players.size() <= 8) {
                this.players = players;
                this.dices = dices;
                this.board = board;
                this.n = n;
            }
            else{
                throw new IllegalArgumentException("");
            }
        } catch(IllegalArgumentException e){
            System.out.println("Invalid number of players. Please enter between 2 and 8 players.");
            System.exit(0);
        }
    }

    public void playGame() {
        System.out.println("This game has " + board.getSquares().size() + " squares.\n");

        for (roundCount = 1; roundCount <= n; roundCount++) {
            System.out.println("Round " + roundCount + " has started.");
            playRound();
            System.out.println("Round " + roundCount + " has finished.\n");
        }
        System.out.println("The game is finished!");
    }

    public void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
