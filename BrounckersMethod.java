import java.util.Scanner;

public class BrounckersMethod 
{
	public static double brounckers (int input, int increment, int factor)
	{
		if (input == increment)
		{
			increment--;
			
			return 4 / (1 + (Math.pow(1, 2) / brounckers(input, increment, factor)));
		}
		else if (increment > 1)
		{
			increment--;
			factor += 2;
			
			return 2 + (Math.pow(factor, 2) / brounckers(input, increment, factor));
		}
		else if (increment == 1)
		{
			return 2 + (Math.pow(factor, 2));
		}
		return 0;
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter an artifical stopping point");
		int input = testScanner.nextInt();
		int increment = input;
		int factor = 1;
		// double brounckersNum = 0;
		System.out.println(brounckers(input, increment, factor));
		
		testScanner.close();
	}
}