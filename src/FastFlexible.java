/**
 * This class extends the FastPiece.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

public class FastFlexible extends FastPiece {

    private String fastFlexible = "ff";

    //getters
    public String getType() {
        return fastFlexible;
    }

    //constructor
    public FastFlexible(String name, String colour, int x, int y) {
        super(name, colour, x, y);
    }

    //move method
    //This method does all the direction operations and returns the direction according to the user.
    @Override
    public void move(String direction, int n) {
        if(direction.equals("left") || direction.equals("right")) {
            super.move(direction, n);

        } else if(direction.equals("up")) {
            int x = getX();

            if(x-n < 0) {
                return;
            } else {
                setLocation(x-=n, getY());
            }

        } else if(direction.equals("down")) {
            int x = getX();

            if(x+n > 7) {
                return;
            } else {
                setLocation(x+=n, getY());
            }

        }
    }

    //toString
    public String toString() {
        return super.toString() + "F";
    }
}
