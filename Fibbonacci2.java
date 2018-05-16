import java.util.Scanner;

public class Fibbonacci2 
{
	public static int fibonacci(int n)  
	{
	    if (n == 0)
	    {
	    	return 0;
	    }
	    else if (n == 1)
	    {
	    	return 1;
	    }
	    else
	    {
	    	return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter a number to find that number in the fibbonacci sequence");
		int input = testScanner.nextInt();
		testScanner.close();
		
		fibonacci(input);
	}
}