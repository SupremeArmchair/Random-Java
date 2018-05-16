import java.util.Scanner;

public class MidtermPartOne
{
	public static void triangle(int depth, double length, double inputx, double inputy)
	{
		depth--;
		
		// Finds coordinates of lines for new triangle
		double x1 = length * Math.cos(Math.PI / 3) + inputx;
		double y1 = length * Math.sin(Math.PI / 3) + inputy;
		
		double x2 = length * Math.cos((2 * Math.PI) / 3) + inputx;
		double y2 = length * Math.sin((2 * Math.PI) / 3) + inputy;
		
		// Draws the polygon (triangle)
		double[] x = {x1, x2, inputx};
		double[] y = {y1, y2, inputy};
		
		StdDraw.polygon(x, y);
		
		// Sets up triangle to the lower left of original triangle
		double midpointX2 = inputx - length / 2;
		
		// Sets up triangle to the lower right of original triangle
		double midpointX3 = inputx + length / 2;
		
		// Runs through loop again but with three child methods
		if (depth > 0)
		{
			triangle(depth, length / 2, inputx, y1);
			triangle(depth, length / 2, midpointX2, inputy);
			triangle(depth, length / 2, midpointX3, inputy);
		}
	}
	public static void main(String[] args)
	{
		// Creates new scanner to get user inputed depth
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter depth");
		int depth = testScanner.nextInt();
		testScanner.close();
		
		// Makes canvas
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.setScale(0, 1000);
		
		depth--;
		
		// Draws first triangle
		if (depth >= 0)
		{	
			double[] x = {0, 500, 1000};
			double[] y = {0, Math.sqrt(Math.pow(1000, 2) - Math.pow(500, 2)), 0};
			
			StdDraw.polygon(x, y);
				
			// Begins loops
			if (depth >= 1)
			{
				triangle(depth, 500, 500, 0);
			}
			
			// Displays image
			StdDraw.show();
		}
	}
}