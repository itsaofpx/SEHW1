package ku.cs.se;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }
    public void createSquare(int size) {
        for (int i = 0; i < size; i++) {
            squares.add(new Square("Square " , i));
        }
    }
    public Square firstIndex(){
        return squares.get(0);
    }
    public Square getSquare(Square oldLoc, int move) {
        int newIndex = (oldLoc.getLocation() + move) % squares.size();
        return squares.get(newIndex);
    }

    public List<Square> getSquares() {
        return squares;
    }

    public void setSquares(ArrayList<Square> squares) {
        this.squares = squares;
    }
}
