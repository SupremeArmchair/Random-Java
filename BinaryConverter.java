import java.util.ArrayList;
import java.util.Scanner;

/*
 * Converts values from decimal to binary, binary to decimal, and decimal to hexadecimal
 */
public class BinaryConverter
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i == 1)
		{
			Scanner testScanner = new Scanner(System.in);
			System.out.println("Do you want to convert decimal to binary, binary to decimal, or decimal to hexadecimal?");
			String input = testScanner.next();
			testScanner.close();
			
			ArrayList<String> list = new ArrayList<String>();
			
			int g = 0;
			int loopTime = -1;
			
			if (input.equalsIgnoreCase("b") || input.equalsIgnoreCase ("binary"))
			{
				System.out.println("Enter value to be converted to binary");
				int input_1 = testScanner.nextInt();
				int input1 = input_1;
				
				while (input1 > 0)
				{
					loopTime++;
					list.add((Integer.toString(input1 % 2)));
					input1 = input1 / 2;
				}
				while (loopTime >= 0)
				{
					System.out.print(list.get(loopTime));
					loopTime--;
				}
				System.out.println("");
			}
			else if (input.equalsIgnoreCase("d") || input.equalsIgnoreCase("decimal"))
			{
				System.out.println("Enter value to be converted to decimal");
				int input_1 = testScanner.nextInt();
				int input1 = input_1;
				
				int x = 0;
				int decimal = 0;
				
				while (input1 > 0)
				{
					int temp = input1 % 10;
					decimal += temp * Math.pow(2,  x);
					input1 = input1 / 10;
					x++;
				}
				System.out.println(decimal);
			}
			else if (input.equalsIgnoreCase("h") || input.equalsIgnoreCase("hexadecimal"))
			{
				System.out.println("Enter value to be converted to hexidecimal");
				int input_1 = testScanner.nextInt();
				int input1 = input_1;
				
				while  (input1 > 0)
				{
					loopTime++;
					int input2 = input1 % 16;
					list.add(Integer.toString(input2));
					input1 = input1 / 16;
				}
				for (g = 0; g < list.size(); g++)
				{
					if (list.get(g) == "11")
					{
						list.set(g, "A");
					}
					if (list.get(g) == "12")
					{
						list.set(g, "B");
					}
					if (list.get(g) == "13")
					{
						list.set(g, "C");
					}
					if (list.get(g) == "14")
					{
						list.set(g, "D");
					}
					if (list.get(g) == "15")
					{
						list.set(g, "E");
					}
					if (list.get(g) == "16")
					{
						list.set(g, "F");
					}
				}
				while (loopTime >= 0)
				{
					System.out.print(list.get(loopTime));
					loopTime--;
				}
				System.out.println("");
			}
			else if (input.equalsIgnoreCase("exit"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("You did not enter a valid input!");
			}
		}
	}
}