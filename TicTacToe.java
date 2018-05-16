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

public class TicTacToe 
{
	public static void printGameBoard(String[][] array)
	{
		for (int i = 0; i <= 4; i++)
		{
			for (int j = 0; j <= 4; j++)
			{
				System.out.print(array[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
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
		
		String player = "X";
		
		boolean win1 = false;
		
		Scanner testScanner = new Scanner(System.in);
		
		while (win1 != true)
		{
			printGameBoard(gameBoard);
			
			if (player.equals("O"))
			{
				System.out.println("Player X choose a spot");
				player = "X";
			}
			else if (player.equals("X"))
			{
				System.out.println("Player O choose a spot");
				player = "O";
			}
			int input = testScanner.nextInt();
			
			switch (input)
			{
				case 1: gameBoard[0][0] = player;
				break;
				
				case 2: gameBoard[0][2] = player;
				break;
				
				case 3: gameBoard[0][4] = player;
				break;
				
				case 4: gameBoard[2][0] = player;
				break;
				
				case 5: gameBoard[2][2] = player;
				break;
				
				case 6: gameBoard[2][4] = player;
				break;
				
				case 7: gameBoard[4][0] = player;
				break;
				
				case 8: gameBoard[4][2] = player;
				break;
				
				case 9: gameBoard[4][4] = player;
				break;
			}
			winConditon(gameBoard);
		}
		testScanner.close();
	}
}