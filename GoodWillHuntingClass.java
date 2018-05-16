import java.util.Scanner;

public class GoodWillHuntingClass 
{
	public static void fillArray (Double[][] equationsList, int userInput)
	{
		Scanner arrayScanner = new Scanner(System.in);
		
		for (int firstIncrement = 0; firstIncrement <= userInput - 1; firstIncrement ++)
		{
			System.out.println("Next equation");
			
			for (int secondIncrement = 0; secondIncrement <= userInput; secondIncrement ++)
			{
				System.out.println("Enter value in the equation: ");
				double arrayInput = arrayScanner.nextDouble();
				
				equationsList[firstIncrement][secondIncrement] = arrayInput;
			}
		}
		arrayScanner.close();
	}
	
	public static double cramersRule (Double[][] equationsList)
	{
		if (equationsList.length == 2)
		{
			determinant (equationsList);
		}
		else if (equationsList.length > 2)
		{
			Double[][] smallArray1 = new Double[equationsList.length - 1][equationsList.length - 1];
			for (int i = 1; i <= equationsList.length - 1; i++)
			{
				for (int j = 1; j <= equationsList.length - 1; j++)
				{
					smallArray1[j - 1][i - 1] = equationsList[j][i];
				}
			}
			
			Double[][] smallArray2 = new Double[equationsList.length - 1][equationsList.length - 1];
			int k = 0;
			for (int i = 0; i <= equationsList.length - 1; i += 2)
			{
				for (int j = 1; j <= equationsList.length - 1; j++)
				{
					smallArray2[j][k] = equationsList[j][i];
				}
				k++;
			}
			
			Double[][] smallArray3 = new Double[equationsList.length - 1][equationsList.length - 1];
			for (int i = 0; i <= equationsList.length - 2; i++)
			{
				for (int j = 0; j <= equationsList.length - 2; j++)
				{
					smallArray3[j][i] = equationsList[j][i];
				}
			}
		}
		return cramersRule (equationsList);
	}
	public static double determinant (Double[][] equationsList)
	{
		double firstVariable = equationsList[0][0] * equationsList[1][1];
		double secondVariable = equationsList[1][0] * equationsList[0][1];
		
		return firstVariable - secondVariable;
	}
}