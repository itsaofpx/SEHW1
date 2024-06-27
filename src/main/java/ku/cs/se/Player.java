package ku.cs.se;
//6510450691 Podjanin Wachirawittayakul
import java.util.ArrayList;

public class Player {
    private String name;
    private Piece piece;
    private Board board;
    private ArrayList<Dice> dices;

    public Player(String name, Piece piece, ArrayList<Dice> dices, Board board) {
        this.name = name;
        this.piece = piece;
        this.dices = dices;
        this.board = board;
    }

    public void takeTurn() {
        int fvTot = 0;
        for (Dice dice : dices) {
            fvTot += dice.roll();
        }
        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
        System.out.println(name + " moves from " + oldLoc.getLocation() + " -> " + newLoc.getLocation());
    }
}