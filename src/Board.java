/**
 * This class does the Board class.
 * It holds a 8x8 game board.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

//importing
import java.util.ArrayList;

public class Board {

    private ArrayList<ArrayList<Piece>> gameBoard = new ArrayList<ArrayList<Piece>>();

    //constructor
    public Board() {
        for(int i = 0; i < 8; i++) {

            gameBoard.add(new ArrayList<Piece>());

            for(int j = 0; j < 8; j++) {
                gameBoard.get(i).add(null);
            }
        }

    }

    //This add method adds a new piece.
    //It considers all the types of pieces and defines it position by adding.
    //The conditions are checking the necessary additions and if addition can really be performed or not.
    public void add(String name, String colour, int x, int y, String type) {
        if(gameBoard.get(y).get(x) == null) {

            if(type.equals("S")) {
                SlowPiece slowPiece = new SlowPiece(name, colour, x, y);
                gameBoard.get(y).add(x,slowPiece);
            } else if(type.equals("F")) {
                FastPiece fastPiece = new FastPiece(name, colour, x, y);
                gameBoard.get(y).add(x, fastPiece);
            } else if(type.equals("SF")) {
                SlowFlexible slowFlexible = new SlowFlexible(name, colour, x, y);
                gameBoard.get(y).add(x, slowFlexible);
            } else if(type.equals("FF")) {
                FastFlexible fastFlexible = new FastFlexible(name, colour, x, y);
                gameBoard.get(y).add(x, fastFlexible);
            }

        } else {
            System.out.println("Sorry Piece cannot be added.");
        }

    }

    //This is a move method.
    //This method moves a piece at the required position and if the piece cannot be moved, then error message pops up.
    //The conditions are checking if there is space for the piece to move or not.
    //The directions are left, right, up and down.
    //Each direction is considered individually and is then operated.
    public void move(int x, int y, String direction, int spaces) {
        if(gameBoard.get(y).get(x) != null) {
            if(gameBoard.get(y).get(x).getType().equals("s")) {
                SlowPiece slowPiece = (SlowPiece) gameBoard.get(y).get(x);
                if(direction.equals("left") && gameBoard.get(y-1).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y-1).add(x, slowPiece);
                    slowPiece.move(direction);
                } else if(direction.equals("right") && gameBoard.get(y+1).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y+1).add(x, slowPiece);
                    slowPiece.move(direction);
                } else {
                    System.out.println("Invalid move.");
                }
            }

            else if(gameBoard.get(y).get(x).getType().equals("f")) {
                FastPiece fastPiece = (FastPiece) gameBoard.get(y).get(x);
                if(direction.equals("left") && gameBoard.get(y-spaces).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y-spaces).add(x, fastPiece);
                    fastPiece.move(direction, spaces);
                } else if(direction.equals("right") && gameBoard.get(y+spaces).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y+spaces).add(x, fastPiece);
                    fastPiece.move(direction, spaces);
                } else {
                    System.out.println("Invalid move.");
                }
            }

            else if(gameBoard.get(y).get(x).getType().equals("sf")) {
                SlowFlexible slowFlexible = (SlowFlexible) gameBoard.get(y).get(x);
                if(direction.equals("left") && gameBoard.get(y-1).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y-1).add(x, slowFlexible);
                    slowFlexible.move(direction);
                } else if(direction.equals("right") && gameBoard.get(y+1).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y + 1).add(x, slowFlexible);
                    slowFlexible.move(direction);
                } else if(direction.equals("up") && gameBoard.get(y).get(x-1) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y).add(x - 1, slowFlexible);
                    slowFlexible.move(direction);
                } else if(direction.equals("down") && gameBoard.get(y).get(x+1) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y).add(x+1, slowFlexible);
                    slowFlexible.move(direction);
                } else {
                    System.out.println("Invalid move.");
                }
            }

            else if(gameBoard.get(y).get(x).getType().equals("ff")) {
                FastFlexible fastFlexible = (FastFlexible) gameBoard.get(y).get(x);
                if(direction.equals("left") && gameBoard.get(y-spaces).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y-spaces).add(x, fastFlexible);
                    fastFlexible.move(direction, spaces);
                } else if(direction.equals("right") && gameBoard.get(y+spaces).get(x) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y+spaces).add(x, fastFlexible);
                    fastFlexible.move(direction, spaces);
                } else if(direction.equals("up") && gameBoard.get(y).get(x-spaces) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y).add(x - spaces, fastFlexible);
                    fastFlexible.move(direction, spaces);
                } else if(direction.equals("down") && gameBoard.get(y).get(x+spaces) == null) {
                    gameBoard.get(y).add(x, null);
                    gameBoard.get(y).add(x+spaces, fastFlexible);
                    fastFlexible.move(direction, spaces);
                } else {
                    System.out.println("Invalid move.");
                }
            }
        } else {
            System.out.println("Invalid move.");
        }
    }

    //This displays the game board which is the name, color and type of the pieces.
    //The condition does the checking that is if the board is empty or not and then provides the necessary output.
    public void display() {
       for(int i = 0; i < 8; i++) {
           for(int j = 0; j < 8; j++) {
               if(gameBoard.get(i).get(j) == null) {
                   System.out.print("-" + " " + " " + " ");
               } else {
                   System.out.print(gameBoard.get(i).get(j) + " " + " " + " ");
               }
           }
           System.out.print("\n");
       }
    }

}
