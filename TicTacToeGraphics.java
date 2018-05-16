// Create a text-based game of tic-tac-toe
// Should first print out 1 | 2 | 3 |
//						 -------------
//						  4 | 5 | 6 |
// 						 -------------
// 						  7 | 8 | 9 |
// Player x choose a spot (player types in a number for an x to go in that spot)
// Assume 5 for this example
// Then prints 			  1 | 2 | 3 |
//						 -------------
//						  4 | X | 6 |
// 						 -------------
// 						  7 | 8 | 9 |
// Needs to check for a win condition
// If a player wins, it needs to state that
// If there's a tie, it needs to state that
// Need to make methods out of this
// For instance, printGameBoard()

// Make a 6, 6 gameboard so that x can be 5, 5 and centered
import java.util.Scanner;
import java.awt.*;

public class TicTacToeGraphics
{
	public static void pickSpot(Rectangle square1, Rectangle square2, Rectangle square3, Rectangle square4, Rectangle square5, Rectangle square6, Rectangle square7, Rectangle square8, Rectangle square9, String player)
	{
		
		while(StdDraw.mousePressed() == false)
		{
			
		}
		
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		
		while(StdDraw.mousePressed() == true)
		{
			
		}
		
		if (square1.contains(x, y))
		{
			StdDraw.text(1, 1, player);
		}
		else if (square2.contains(x, y))
		{
			StdDraw.text(3, 1, player);
		}
		else if (square3.contains(x, y))
		{
			StdDraw.text(5, 1, player);
		}
		else if (square4.contains(x, y))
		{
			StdDraw.text(1, 3, player);
		}
		else if (square5.contains(x, y))
		{
			StdDraw.text(3, 3, player);
		}
		else if (square6.contains(x, y))
		{
			StdDraw.text(5, 3, player);
		}
		else if (square7.contains(x, y))
		{
			StdDraw.text(1, 5, player);
		}
		else if (square8.contains(x, y))
		{
			StdDraw.text(3, 5, player);
		}
		else if (square9.contains(x, y))
		{
			StdDraw.text(5, 5, player);
		}
	}
	public static void printGameBoard(String[][] array)
	{
		StdDraw.show();
	}
	public static void winConditon(String[][] array)
	{	
		equalChecker(array, 0, 0, 0, 2, 0, 4);
		
		equalChecker(array, 2, 0, 2, 2, 2, 4);
		
		equalChecker(array, 4, 0, 4, 2, 4, 4);
		
		equalChecker(array, 0, 0, 2, 0, 4, 0);
		
		equalChecker(array, 0, 2, 2, 2, 4, 2);
		
		equalChecker(array, 0, 4, 2, 4, 4, 4);
		
		equalChecker(array, 0, 0, 2, 2, 4, 4);
		
		equalChecker(array, 4, 0, 2, 2, 0, 4);
	}
	public static void equalChecker (String[][] array3, int a, int b, int c, int d, int e, int f)
	{
		String winningPlayer = "";
		if (array3[a][b].equals(array3[c][d]))
		{
			if (array3[a][b].equals(array3[e][f]))
			{
				if (array3[a][b].equals("X"))
				{
					winningPlayer = "X";
					System.out.println("Player " + winningPlayer + " wins!");
					System.exit(0);
				}
				else if (array3[a][b].equals("O"))
				{
					winningPlayer = "O";
					System.out.println("Player " + winningPlayer + " wins!");
					System.exit(0);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		Font font = new Font("Arial", Font.BOLD, 60);
		StdDraw.setFont(font);
		
		String[][] gameBoard = new String[5][5];
		
		gameBoard[0][0] = "1";
		gameBoard[1][0] = "-";
		gameBoard[2][0] = "4";
		gameBoard[3][0] = gameBoard[1][0];
		gameBoard[4][0] = "7";
		gameBoard[0][1] = "|";
		gameBoard[1][1] = gameBoard[1][0];
		gameBoard[2][1] = gameBoard[0][1];
		gameBoard[3][1] = gameBoard[1][0];
		gameBoard[4][1] = gameBoard[0][1];
		gameBoard[0][2] = "2";
		gameBoard[1][2] = gameBoard[1][0];
		gameBoard[2][2] = "5";
		gameBoard[3][2] = gameBoard[1][0];
		gameBoard[4][2] = "8";
		gameBoard[0][3] = gameBoard[0][1];
		gameBoard[1][3] = gameBoard[1][0];
		gameBoard[2][3] = gameBoard[0][1];
		gameBoard[3][3] = gameBoard[1][0];
		gameBoard[4][3] = gameBoard[0][1];
		gameBoard[0][4] = "3";
		gameBoard[1][4] = gameBoard[1][0];
		gameBoard[2][4] = "6";
		gameBoard[3][4] = gameBoard[1][0];
		gameBoard[4][4] = "9";
		
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.setXscale(0.0, 6.0);
		StdDraw.setYscale(0.0, 6.0);
		StdDraw.square(3, 3, 3);
		StdDraw.line(2, 0, 2, 6);
		StdDraw.line(0, 2, 6, 2);
		StdDraw.line(4, 0, 4, 6);
		StdDraw.line(0, 4, 6, 4);
		
		StdDraw.square(1, 1, 1);
		StdDraw.square(1, 3, 1);
		StdDraw.square(1, 5, 1);
		StdDraw.square(3, 1, 1);
		StdDraw.square(3, 3, 1);
		StdDraw.square(3, 5, 1);
		StdDraw.square(5, 1, 1);
		StdDraw.square(5, 3, 1);
		StdDraw.square(5, 5, 1);
		
		Rectangle square1 = new Rectangle(0, 0, 2, 2);
		Rectangle square2 = new Rectangle(2, 0, 2, 2);
		Rectangle square3 = new Rectangle(4, 0, 2, 2);
		Rectangle square4 = new Rectangle(0, 2, 2, 2);
		Rectangle square5 = new Rectangle(2, 2, 2, 2);
		Rectangle square6 = new Rectangle(4, 2, 2, 2);
		Rectangle square7 = new Rectangle(0, 4, 2, 2);
		Rectangle square8 = new Rectangle(2, 4, 2, 2);
		Rectangle square9 = new Rectangle(4, 4, 2, 2);
		
		String player = "X";
		
		boolean win1 = false;
		
		Scanner testScanner = new Scanner(System.in);
		
		while (win1 != true)
		{
			printGameBoard(gameBoard);
			
			if (player.equals("O"))
			{
				player = "X";
			}
			else if (player.equals("X"))
			{
				player = "O";
			}
			pickSpot(square1, square2, square3, square4, square5, square6, square7, square8, square9, player);
			
			//winConditon(gameBoard);
		}
		testScanner.close();
	}
}