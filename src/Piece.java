/**
 * This class defines the piece class with name, colour and position.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

import java.awt.Point;

public class Piece {
    private String type = "piece";
    private String name, colour;
    Point position  = new Point();

    //constructor that takes in name, colour and position
    public Piece(String name, String colour, int x, int y) {
        this.name = name;
        this.colour = colour;
        this.position.setLocation(x,y);
    }

    //getters
    public String getName() {
        return this.name;
    }

    public String getColour() {
        return this.colour;
    }

    public int getX() {
        return (int) this.position.getX();
    }

    public int getY() {
        return (int) this.position.getY();
    }

    public String getType() {
        return type;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLocation(int x, int y) {
        this.position.setLocation(x,y);
    }

    //toString
    public String toString() {
        return name + colour;
    }
}
