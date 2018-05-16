import java.util.Scanner;


// Doesn't work for numbers greater than 482
// Not sure why but its a feature not a bug

public class NaturalNumbers 
{
	public static void printNum(int n)
	{
		if (n >= 2)
		{
			System.out.print(n + " ");
			printNum(n - 1);
			System.out.print(n + " ");
		}
		else
		{
			System.out.print("1 ");
		}
	}
	public static void printNumBackUp(int n)
	{
		int up = n;
		printNum(n);
		System.out.println("");
		if (n < up)
		{
			System.out.print(n);
			n++;
			printNumBackUp(n);
		}
		else
		{
			System.out.print(up);
		}
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter a number to count down from");
		int input = testScanner.nextInt();
		printNum(input);
		//printNumBackUp(input);
		testScanner.close();
	}
}