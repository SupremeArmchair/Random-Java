import java.util.Scanner;

public class Abs 
{
	public static double absolute (double number)
	{
		double absoluteValue = number;
		if (number < 0)
		{
			absoluteValue = (number * -1);
		}
		return absoluteValue;
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter number to turn it into its absolute value: ");
		double input = testScanner.nextDouble();
		System.out.println(absolute(input));
		testScanner.close();
	}
}