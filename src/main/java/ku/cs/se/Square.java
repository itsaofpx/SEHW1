package ku.cs.se;

public class Square {
    private String name;
    private int location;

    public Square(String name, int location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }
}
