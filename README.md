<img src="https://github.com/user-attachments/assets/2ad86f70-12b4-4500-997d-9f8c1874a9b5" alt="Dal logo" width="80"/>
<h1>Associated with Dalhousie University</h1>

### CSCI2110
### Board Game Project
This project implements a custom board game in Java. The game features a 8x8 board with various types of pieces that can move in different ways.

### Project Structure
The project consists of the following Java classes:

- Board.java: Represents the game board and manages piece placement and movement.
- Piece.java: Base class for all game pieces.
- SlowPiece.java: Represents a piece that can move one space at a time.
- FastPiece.java: Represents a piece that can move multiple spaces at a time.
- SlowFlexible.java: Extends SlowPiece with additional movement options.
- FastFlexible.java: Extends FastPiece with additional movement options.
- GameDemo.java: Contains the main method to run the game and handle user input.

### Features
- 8x8 game board
- Four types of pieces: Slow, Fast, SlowFlexible, and FastFlexible
- Piece movement in various directions (left, right, up, down)
- Command-line interface for game interaction

### How to Run

1. Compile all Java files.
2. Run the GameDemo class.
3. Follow the on-screen prompts to interact with the game.

### Commands
- create location [fast][flexible]: Creates a new piece.
- move location direction [spaces]: Moves a piece.
- print: Displays the board.
- help: Displays help information.
- exit: Exits the program.

#### Sample input and output
```
Enter a command (type help for details) :
help
Possible commands are as follows: 
create location [fast][flexible]: Creates a new piece.
move location direction [spaces]: Moves a piece.
print: Displays the board.
help: Displays help.
exit: Exits the program.
exit

Process finished with exit code 0

Enter a command (type help for details) :
print
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
exit

Process finished with exit code 0

Enter a command (type help for details) :
3 3
fast flexible
create 3 3 fast flexible
Input a name for the new piece: 
Jedi
Input a colour for the new piece: 
Red
Enter a command (type help for details): 
print
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   
-   -   -   -   -   -   -   -   

Enter a command (type help for details) :
2 4
slow flexible
create 2 4 slow flexible
Input a name for the new piece: 
Droid
Input a colour for the new piece: 
Black

Enter a command (type help for details) :
move 7 7
Error no piece at (7,7)
Enter a command (type help for details): 
exit

Process finished with exit code 0
```
