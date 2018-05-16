import java.util.Scanner;

public class Asteroids extends AsteroidsClass
{
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = testScanner.next();
		testScanner.close();
		
		Ship playerShip = new Ship(name);
		
		StdDraw.setCanvasSize(1800, 1800);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		
		// play(playerShip);
		
		StdDraw.show();
	}
}