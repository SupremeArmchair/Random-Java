import java.util.Scanner;

/*
 * Repeats your age after it is entered
 */
public class Intro
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Type in your age in years:");
		String input = in.next();
		System.out.println("Hello, you are " + input + " years old");
		in.close();
	}
}