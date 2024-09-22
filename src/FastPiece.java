/**
 * This class defines the piece to move from left or right but this time it is not one space.
 * It also extends the Piece class.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

public class FastPiece extends Piece{

    private String fastPiece = "f";

    //getter
    public String getType() {
        return fastPiece;
    }
    //constructor
    public FastPiece(String name, String colour, int x, int y) {
        super (name, colour, x, y);
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "F";
    }

    //Class Methods
    //This method changes the position of the piece left or right taking into consideration the amount of spaces.
    //If the user wants a move that gets the piece out of board, then it just returns nothing.
    public void move(String direction, int n) {
        if (direction.equals("left")) {
            int x = getY();

            if (x - n < 0) {
                return;
            } else {
                setLocation(getX(), x -= n);
            }

        } else if (direction.equals("right")) {
            int x = getY();

            if (x + n > 0) {
                return;
            } else {
                setLocation(getX(), x += n);
            }
        } else {
            System.out.println("Invalid move.");
        }
    }

}
