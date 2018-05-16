import java.util.Scanner;

// Make binary tree through graphics
// Due Tuesday

public class BinaryTree
{
	public static void branch(double x0, double y0, double angle, double length, int depth)
	{
		depth--;
		double x1 = length * Math.cos(angle) + x0;
		double y1 = length * Math.sin(angle) + y0;
		
		StdDraw.line(x0, y0, x1, y1);
		
		if (depth > 1)
		{
			branch(x1, y1, angle - Math.PI / 4, length / 2, depth);
			branch(x1, y1, angle + Math.PI / 4, length / 2, depth);
		}
	}
	
	// Main method
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("How many times do you want to go through the loop?");
		int depth = testScanner.nextInt();
		testScanner.close();
		
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.setScale(0, 1000);
		
		depth++;
		
		branch(500, 0, Math.PI / 2, 500, depth);
		
		StdDraw.show();
	}
}