// Input number of equations, than values in equations
// Number of equations = number of variables
// Has to be recursive

import java.util.Arrays;
import java.util.Scanner;

public class GoodWillHunting extends GoodWillHuntingClass
{
	public static void main(String[] args)
	{
		// Makes new scanner and recieves input
		Scanner testScanner = new Scanner(System.in);
		System.out.println("How many equations do you want?");
		int userInput = testScanner.nextInt();
		
		// Makes two-dimensional array
		Double[][] equationsList = new Double[userInput][userInput + 1];
		
		// Fills array with user inputted values
		fillArray(equationsList, userInput);
		
		// Prints array to double check
		System.out.println(Arrays.deepToString(equationsList));
		
		// Kills scanner
		testScanner.close();
		
		// Makes coefficient matrix's determinant array
		Double[][] matrixDeterminant = new Double[userInput][userInput];
		Double[][] xDeterminant = new Double[userInput][userInput];
		Double[][] yDeterminant = new Double[userInput][userInput];
		Double[][] zDeterminant = new Double[userInput][userInput];
		for (int i = 0; i <= userInput; i++)
		{
			for (int j = 0; j <= userInput; j++)
			{
				matrixDeterminant[i][j] = equationsList[i][j];
				xDeterminant[i][j] = equationsList[i][j];
				yDeterminant[i][j] = equationsList[i][j];
				zDeterminant[i][j] = equationsList[i][j];
			}
		}
	}
}