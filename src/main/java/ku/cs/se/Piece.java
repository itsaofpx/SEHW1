package ku.cs.se;
//6510450691 Podjanin Wachirawittayakul
public class Piece {
    private Square location;

    public Piece(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
