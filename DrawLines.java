import java.util.Scanner;

public class DrawLines 
{
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("How many lines do you want to make?");
		double userInput = testScanner.nextInt();
		
		double x = 0;
		double y = 1;
		
		double ratio = 1 / userInput;
		
		System.out.println(ratio);
		
		StdDraw.setCanvasSize(2000, 2000);
		
		while (userInput >= 0)
		{
			userInput--;
			StdDraw.line(x, y, y, x);
			// x += ratio;
			y -= ratio;
			
			System.out.println("X is " + x);
			System.out.println("Y is " + y);
		}
		StdDraw.show();
		
		testScanner.close();
	}
}