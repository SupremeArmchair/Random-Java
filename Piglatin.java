import java.util.Scanner;

/*
 * A program that makes words into piglatin
 */
public class Piglatin 
{
	public static void main(String[] args)
	{
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter word to convert to pig-latin");
		String userInput = testScanner.next();
		testScanner.close();
			
		if (userInput.equals("exit"))
		{
			System.exit(0);
		}
			
		char temp = userInput.charAt(0);
		String temp2 = userInput.substring(1, userInput.length());
		String pigLatin = temp2 + temp + "ay";
		
		pigLatin = pigLatin.toLowerCase();
		
		String temp3 = pigLatin.substring(0, 1);
		
		temp2 = pigLatin.substring(1, pigLatin.length());
		pigLatin = temp3.toUpperCase() + temp2;
		
		System.out.println(pigLatin);
	}
}