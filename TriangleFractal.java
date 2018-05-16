import java.util.Scanner;

public class TriangleFractal 
{
	public static double findSide(double c, double a)
	{
		return Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
	}
	public static void triangle(int depth, double length, double height, double maxHeight, double x, double y)
	{
		depth--;
		
		length /= 2;
		
		double[] q = {x + length / 2, x + length, x + length + length / 2};
		double[] w = {height + findSide(length, length / 2), height, height + findSide(length, length / 2)};
		
		StdDraw.polygon(q, w);
		
		maxHeight = findSide(length * 2, length) + height;
		
		double[] e = {x + length + length / 2, x + length * 2, x + length * 2 + length / 2};
		double[] r = {maxHeight + findSide(length, length / 2), maxHeight , maxHeight + findSide(length, length / 2)};
		
		StdDraw.polygon(e, r);
		
		double[] t = {y + length * 2 + length / 2, y + length * 3, y + length * 3 + length / 2};
		
		StdDraw.polygon(t, w);
		
		if (depth > 1)
		{
			triangle(depth, length, height, maxHeight, x, y);
			
			x += length;
			height = maxHeight;
			
			triangle(depth, length, height, maxHeight, x, y);
			
			y += length;
			triangle(depth, length, height, maxHeight, x, y);
		}
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter number");
		int depth = testScanner.nextInt();
		testScanner.close();
		
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.setScale(0, 1500);
		
		double maxHeight = findSide(1000, 500);
		
		double[] x = {0, 500, 1000};
		double[] y = {0, maxHeight, 0};
		StdDraw.polygon(x, y);
		
		depth--;
		
		if (depth > 0)
		{
			double[] q = {250, 500, 750};
			double[] w = {findSide(500, 250), 0, findSide(500, 250)};
			
			StdDraw.polygon(q, w);
			
			if (depth > 1)
			{
				triangle(depth, 500, 0, 0, 0, 0);
			}
		}
		
		StdDraw.show();
	}
}