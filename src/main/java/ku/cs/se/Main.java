package ku.cs.se;
//6510450691 Podjanin Wachirawittayakul
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter number of dice: ");
        int numDice = scanner.nextInt();

        System.out.print("Enter size of the board: ");
        int boardSize = scanner.nextInt();

        System.out.print("Enter amount of rounds: ");
        int roundCount = scanner.nextInt();

        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Dice> dices = new ArrayList<>();
        ArrayList<Square> squares = new ArrayList<>();
        Board board = new Board(squares);

        for (int i = 0; i < numDice; i++) {
            dices.add(new Dice(6));
        }

        board.createSquare(boardSize);

        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player(Character.toString((char) ('A' + i)), new Piece(board.firstIndex()), dices, board));
        }
        MGame game = new MGame(players, roundCount, dices, board);
        game.playGame();
    }
}
