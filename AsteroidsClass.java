import java.awt.event.*;

public class AsteroidsClass 
{
	public static void ifHit(Ship playerShip, Asteroid asteroid)
	{
		if ()
		{
			
		}
	}
	public static void move(Ship playerShip)
	{
		
	}
	public static void play(Ship playerShip)
	{
		boolean alive = true;
		
		StdDraw.text(0.5, 0.5, "ASTEROIDS");
		if (keyTyped() == true)
		{
			while (alive = true)
			{
				
				
				Asteroid asteroid = new Asteroid("Steve");
				
				if (ifhit(playerShip, asteroid) == true)
				{
					alive = false;
				}
				
				StdDraw.show();
			}
		}
	}
}