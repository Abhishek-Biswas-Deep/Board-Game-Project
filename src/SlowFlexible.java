/**
 * This class extends the SlowPiece.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

public class SlowFlexible extends SlowPiece {

    private String slowFlexible = "sf";

    //getters
    public String getType() {
        return slowFlexible;
    }

    //constructor
    public SlowFlexible(String name, String colour, int x, int y) {
        super(name, colour, x, y);

    }

    //move method
    //it takes into account all the directions and sets the direction accordingly.
    public void move(String direction) {
        if(direction.equals("left") || direction.equals("right")) {
            super.move(direction);

        } else if(direction.equals("up")) {
            int x = getX();

            if(x-- < 0) {
                return;
            } else {
                setLocation(x, getY());
            }

        } else if(direction.equals("down")) {
            int x = getX();

            if(x++ > 7) {
                return;
            } else {
                setLocation(x, getY());
            }

        }
    }

    //toString
    public String toString() {
        return super.toString() + "F";
    }
}
