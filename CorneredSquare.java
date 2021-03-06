import java.util.Scanner;

public class CorneredSquare 
{
	public static void fractal(int depth, int length)
	{
		depth--;
		if (depth > 0)
		{
			StdDraw.square(length, length, length);
			length += 50;
			
			fractal (depth, length);
		}
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Input depth");
		int depth = testScanner.nextInt();
		testScanner.close();
		
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.setScale(0, 1000);
		
		fractal(depth, 50);
		
		StdDraw.show();
	}
}