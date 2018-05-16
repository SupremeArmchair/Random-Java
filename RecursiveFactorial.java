import java.util.Scanner;

public class RecursiveFactorial 
{
	public static long factorial (int n)
	{
		if (n > 1)
		{
			long factorial1 = n;
			return factorial1 * factorial(n - 1);
		}
		else
		{
			return 1;
		}
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter number to be factorialized");
		int input = testScanner.nextInt();
		System.out.println(factorial(input));
		testScanner.close();
	}
}