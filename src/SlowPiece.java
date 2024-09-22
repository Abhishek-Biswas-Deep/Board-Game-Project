/**
 * This class defines the slow piece. It also extends the piece class.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

public class SlowPiece extends Piece{

    private String type = "s";

    //getters
    public String getType() {
        return type;
    }
    //constructors
    public SlowPiece(String name, String colour, int x, int y) {
        super(name, colour, x, y);
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "S";
    }

    //Class Methods
    //This method moves the piece from left to right and vice versa, but just only one space.
    //If a piece is requested and that move is not within the board, then it just returns.
    public void move(String direction) {
        if(direction.equals("left")) {
            int y = getY();

            if(y-- < 0) {
                return;
            } else {
                setLocation(getX(), y);
            }

        } else if(direction.equals("right")) {
            int y = getY();

            if(y++ > 7) {
                return;
            } else {
                setLocation(getX(), y);
            }

        } else {
            System.out.println("Invalid move.");
        }

    }
}
