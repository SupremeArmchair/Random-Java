import java.util.Scanner;

public class MarbleProbability
{
	public static double factorial (double n)
	{
		int fact = 1;
		for (int increment = 1; increment <= n; increment++)
		{
			fact = fact * increment;
		}
		return fact;
	}
	public static double power (double x, double y)
	{
		double powered = x;
		while (y >= 2)
		{
			powered *= x;
			y--;
		}
		if (y == 0)
		{
			powered = 1;
		}
		return powered;
	}
	public static double choose (double percentBlack, double percentRed, double firstPower, double secondPower, double numMarbDrawn)
	{	
		double ncr = (factorial (numMarbDrawn)) / (factorial (firstPower) * factorial (numMarbDrawn - firstPower));
		double firstPart = power (percentBlack, firstPower);
		double secondPart = power (percentRed, secondPower);
		double chosen = ncr * firstPart * secondPart;
		
		return chosen;
	}
	public static double probability (double percentBlack, double percentRed, double numMarbDrawn, double numMarbTested)
	{
		double loop = numMarbDrawn - numMarbTested;
		double prob = 0;
		double firstPower = numMarbTested;
		double secondPower = numMarbDrawn - numMarbTested;
		
		while (loop >= 0)
		{
			prob += choose (percentBlack, percentRed, firstPower, secondPower, numMarbDrawn);
			
			firstPower++;
			secondPower--;
			loop--;
		}
		return prob;
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter the number of black marbles");
		double numBlack = testScanner.nextInt();
		System.out.println("Enter the number of red marbles");
		double numRed = testScanner.nextInt();
		System.out.println("Enter the number of marbles being drawn");
		double numMarbDrawn = testScanner.nextInt();
		System.out.println("Enter number of marbles to be checked to see if they are black");
		double numMarbTested = testScanner.nextInt();
		testScanner.close();
		
		double total = numBlack + numRed;
		double percentBlack = numBlack / total;
		double percentRed = numRed / total;
		
		double result = probability (percentBlack, percentRed, numMarbDrawn, numMarbTested);
		result *= 100;
		System.out.println("The probability is " + result + "%");
	}
}