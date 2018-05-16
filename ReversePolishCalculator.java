import java.util.ArrayList;
import java.util.Scanner;

public class ReversePolishCalculator
{	
	/**
	 * A method that does the math when an operand appears for a polish calculator
	 * @param numbers is array of number values from expression
	 * @param operand is operand that will be used to calculate the final value
	 */
	public static void doMath(ArrayList<Double> numbers, String operand)
	{
		// Makes variables for values in the array
		double value1 = numbers.get(numbers.size() - 2);
    	double value2 = numbers.get(numbers.size() - 1);
		
    	// Removes the variables from the array
		numbers.remove(numbers.size() - 2);
    	numbers.remove(numbers.size() - 1);
    	
    	// Uses previously declared variables to do the mathematical operation
    	switch (operand)
    	{
    		case "+": 
    			numbers.add(value1 + value2);
    		break;
    		case "-":
    			numbers.add(value1 - value2);
    		break;
    		case "*":
    			numbers.add(value1 * value2);
    		break;
    		case "/":
    			numbers.add(value1 / value2);
    		break;
    	}
	}
	
	/**
	 * A method that recursively solves an expression inputed by a user in reverse polish calculator form
	 * @param expression is user inputed expression to be solved
	 * @param numbers is array of number values from expression
	 * @param workingList is array of numbers while they are still being typed in
	 */
	public static void reversePolishCalculator(String expression, ArrayList<Double> numbers, ArrayList<String> workingList)
	{
		switch (expression.substring(0, 1)) 
		{
			// Checks for operands
			// If operand is found, it utilizes the doMath function to do the calculation
			case "+": 
				doMath(numbers, "+");
            break;
            case "-": 
            	doMath(numbers, "-");
            break;
            case "*": 
            	doMath(numbers, "*");
            break;
            case "/": 
            	doMath(numbers, "/");
            break;
            
            // Checks for numbers
            // If number is found, it adds the number to the working list of numbers
            case "0": 
            	workingList.add("0");
            break;
            case "1": 
            	workingList.add("1");
            break;
            case "2": 
            	workingList.add("2");
            break;
            case "3":
            	workingList.add("3");
            break;
            case "4": 
            	workingList.add("4");
            break;
            case "5": 
            	workingList.add("5");
            break;
            case "6": 
            	workingList.add("6");
            break;
            case "7": 
            	workingList.add("7");
            break;
            case "8": 
            	workingList.add("8");
            break;
            case "9": 
            	workingList.add("9");
            break;
            case ".":
            	workingList.add(".");
            break;
            
            // Checks for space bar
            // If space bar is found, it adds the number from the workingList into the numbers array
            case " ":
            	// System.out.println("Spacebar found!");
            	String number = "";
            	
            	if (workingList.size() >= 1)
            	{
            		while (workingList.size() >= 1)
            		{
            			number += workingList.get(0);
            			workingList.remove(0);
            			// System.out.println("Number is " + number);
            		}
                	numbers.add(Double.parseDouble(number));
            	}
            break;
		}
		
		// Ends loop if the expression has one value left in it
		if (expression.length() == 1)
		{
			return;
		}
		
		// Goes through the loop again if the expression has a length of 3 or more
		else if (expression.length() >= 2)
		{
			// Changes expression to go through loop again
			expression = expression.substring(1, expression.length());
			
			// Goes through loop again
			reversePolishCalculator(expression, numbers, workingList);
		}
	}
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner testScanner = new Scanner(System.in);
		
		// Sets up while loop to continuously calculate numbers
		boolean run = true;
		while (run)
		{
			String expression = "";
			
			// Gets user inputed String expression
			System.out.println("Type exit or end to leave the program");
			System.out.println("Enter expression");
			expression = testScanner.nextLine();
			
			// Makes an array of numbers to add numbers in the array to
			ArrayList<Double> numbers = new ArrayList<Double>();
			
			// Makes a working array of numbers to utilize while numbers are being inputed
			ArrayList<String> workingList = new ArrayList<String>();
			
			// Runs function
			if (expression.length() >= 1)
			{
				// Checks for exit
				if (expression.equalsIgnoreCase("exit") || expression.equalsIgnoreCase("end"))
				{
					run = false;
					return;
				}
				// Runs method
				reversePolishCalculator(expression, numbers, workingList);
				
				// Adds leftover numbers from workingList into numbers
				String number = "";
            	if (workingList.size() >= 1)
            	{
            		while (workingList.size() >= 1)
            		{
            			number += workingList.get(0);
            			workingList.remove(0);
            		}
                	numbers.add(Double.parseDouble(number));
            	}
            	
            	// Prints final result
            	System.out.print(numbers);
			}
			// Makes spacing for the next time it goes through the loop
			System.out.println();
			System.out.println();
		}
	}
}