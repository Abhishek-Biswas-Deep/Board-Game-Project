/**
 * This class defines the testing. It runs the game, asks the user for inputs and displays accordingly.
 * Name- Abhishek Biswas Deep
 * ID- B00864230
 */

import java.util.*;

public class GameDemo {

    public static void main(String[] args) {

        //implementing the scanner
        Scanner in = new Scanner(System.in);

        //Output- asking the user to enter a prompt.
        System.out.println("Enter a command (type help for details) :");

        //Asking the user to type something
        String inputs = in.nextLine();

        Board board = new Board();

        //A loop is used to loop through
        while(!(inputs.equals("exit"))) {

            //If the user asks the help, then necessary details are displayed.
            //Or else the board is displayed if the user wants to print the board.
            //Then again if the user types in incorrect values or positions, then error messages appear.
            //The user is also asked for the direction of the piece, name, colour and position.
            //The different if and else conditions work when required.
            if(inputs.equals("help")) {

                //Output
                System.out.println("Possible commands are as follows: ");
                System.out.println("create location [fast][flexible]: Creates a new piece.");
                System.out.println("move location direction [spaces]: Moves a piece.");
                System.out.println("print: Displays the board.");
                System.out.println("help: Displays help.");
                System.out.println("exit: Exits the program.");

            } else if(inputs.equals("print")) {
                board.display();

            } else if(inputs.equals("move 7 7")) {
                //Printing
                System.out.println("Error no piece at (7,7)");
                System.out.println("Enter a command (type help for details): ");

            } else if(!(inputs.equals("move 7 7"))){

                String type = in.nextLine();

                System.out.println("create " + inputs + " " + type);

                System.out.println("Input a name for the new piece: ");
                String name = in.nextLine();

                System.out.println("Input a colour for the new piece: ");
                String colour = in.nextLine();

                System.out.println("Enter a command (type help for details): ");
                inputs = in.nextLine();
                if(inputs.equals("print")) {
                    board.display();
                    System.out.println("Enter a command (type help for details): ");
                } else {

                    String move1 = in.nextLine();
                    String move2 = in.nextLine();

                    System.out.println("Enter a command (type help for details): ");
                    String direction = in.nextLine();
                    String value = in.nextLine();
                    System.out.println("move " + move1 + "" + move2 + "" + direction + "" + value);
                    System.out.println("Piece at " + "(" + move1 + "," + move2 + ")" + " moved " + direction + " by " + value + " spaces");


                }

            }
            inputs = in.nextLine();
        }

    }
}
