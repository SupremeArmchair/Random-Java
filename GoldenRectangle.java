import java.util.Scanner;

/**
 * Make a recursive golden rectangle
 * Have user input depth to find out how many times it goes through the loop
 */
public class GoldenRectangle 
{
	public static void goldenRectangle(int depth, double x, double y, double length, double phi, int rotation)
	{
		if (depth > 0)
		{
			depth--;
			
			if (depth > 0)
			{
				
				if (rotation % 4 == 0)
				{
					 x += length;
					 y += length;
					 
					 length = (length * phi) - length;
					 
					 StdDraw.line(x, y - length, x + length, y - length);
				}
				
				else if (rotation % 4 == 1)
				{
					x += length;
					y -= length;
					
					length = (length * phi) - length;
					
					StdDraw.line(x - length, y - length, x - length, y);
				}
				
				else if (rotation % 4 == 2)
				{
					x -= length;
					y -= length;
					
					length = (length * phi) - length;
					
					StdDraw.line(x - length, y + length, x, y + length);
				}
				
				else if (rotation % 4 == 3)
				{
					x -= length;
					y += length;
					
					length = (length * phi) - length;
					
					StdDraw.line(x + length, y, x + length, y + length);
				}
				
				rotation ++;
				goldenRectangle(depth, x, y, length, phi, rotation);
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter depth");
		int depth = testScanner.nextInt();
		testScanner.close();
		
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.setScale(0, 1000);
		
		depth++;
		
		double phi = (1 + Math.sqrt(5)) / 2;
		System.out.println("Phi is " + phi);
		
		double length = 1000 / phi;
		
		StdDraw.rectangle(500, length / 2, 500, length / 2);
		
		int rotation = 0;
		
		StdDraw.line(length, 0, length, length);
		
		depth--;
		
		goldenRectangle(depth, 0, 0, length, phi, rotation);
		
		StdDraw.show();
	}
}