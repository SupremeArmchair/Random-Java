import java.util.Scanner;

public class Fibbonacci
{
	public static int fibonacci (int input)  
	{
	    if (input == 0)
	    {
	    	return 0;
	    }
	    else if (input == 1)
	    {
	    	return 1;
	    }
	    return fibonacci(input - 1) + fibonacci(input - 2);
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter a number to find that number in the fibonacci sequence");
		int input = testScanner.nextInt();
		
		System.out.println(fibonacci(input));
		testScanner.close();
	}
}