// Make it add, divide, multiply, and subtract fractions
// Also reduce fractions
// import java.util.Scanner;

public class Fraction 
{
	private double denominator;
	private double numerator;
	
	public Fraction(double numerator, double denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public static String myFrac(double numerator, double denominator)
	{
		if (numerator < 0 && denominator < 0)
		{
			numerator *= - 1;
			denominator *= -1;
		}
		return numerator + "/" + denominator;
	}
	public static double lcd(Fraction fraction1, Fraction fraction2)
	{
		double denominator1 = fraction1.denominator;
		double denominator2 = fraction2.denominator;
	
		double lcd = 0;
		
		if (denominator1 > denominator2)
		{
			boolean match = false;
			while (match == false)
			{
				lcd += denominator1;
				if (lcd % denominator2 == 0)
				{
					System.out.println("LCD is " + lcd);
					match = true;
				}
			}
		}
		else if (denominator1 < denominator2)
		{
			boolean match = false;
			while (match == false)
			{
				lcd += denominator2;
				if (lcd % denominator1 == 0)
				{
					System.out.println("LCD is " + lcd);
					match = true;
				}
			}
		}
		
		// Both denominators must be the same if neither of the first two conditions go off
		else if (denominator1 == denominator2)
		{
			lcd = denominator1;
		}
		
		return lcd;
	}
	public static Fraction commonTerms(Fraction fraction1, Fraction fraction2, String operand)
	{	
		Fraction fraction3 = new Fraction(1, 1);
		if (operand.equals("+") || operand.equals("-"))
		{
			double lcd = lcd(fraction1, fraction2);
			double lcd1 =  lcd / fraction1.denominator;
			double lcd2 =  lcd / fraction2.denominator;
			
			System.out.println("f1d " + fraction1.denominator);
			
			System.out.println("LCD1 is " + lcd1);
			System.out.println("LCD2 is " + lcd2);
			
			fraction1.numerator *= lcd1;
			fraction1.denominator *= lcd1;
			
			fraction2.numerator *= lcd2;
			fraction2.denominator *= lcd2;
			
			System.out.println("Fraction1 is " + fraction1.numerator + "/" + fraction1.denominator);
			System.out.println("Fraction2 is " + fraction2.numerator + "/" + fraction2.denominator);
			
			double numerator1 = 0;
			double denominator1 = 0;
			
			if (operand.equals("+"))
			{
				numerator1 = fraction1.numerator + fraction2.numerator;
				denominator1 = fraction1.denominator;
			}
			else if (operand.equals("-"))
			{
				numerator1 = fraction1.numerator - fraction2.numerator;
				denominator1 = fraction1.denominator;
			}
			
			fraction3 = new Fraction(numerator1, denominator1);
		}
		else if (operand.equals("*"))
		{
			double numerator1 = fraction1.numerator * fraction2.numerator;
			double denominator1 = fraction1.denominator * fraction2.denominator;
			
			fraction3 = new Fraction(numerator1, denominator1);
		}
		else if (operand.equals("/"))
		{
			double numerator1 = fraction1.numerator * fraction2.denominator;
			double denominator1 = fraction1.denominator * fraction2.numerator;
			
			fraction3 = new Fraction(numerator1, denominator1);
		}
		return fraction3;
	}
	public static void printFrac(Fraction fraction)
	{
		if (fraction.numerator > fraction.denominator)
		{
			for (int i = 2; i < fraction.denominator; i++)
			{
				if (fraction.numerator % i == 0 && fraction.denominator % i == 0)
				{
					fraction.numerator = (fraction.numerator / i);
					fraction.denominator = (fraction.denominator / i);
					i--;
				}
			}
		}
		else if (fraction.numerator < fraction.denominator)
		{
			
			for (int i = 2; i < fraction.numerator; i++)
			{
				if (fraction.numerator % i == 0 && fraction.denominator % i == 0)
				{
					fraction.numerator = (fraction.numerator / i);
					fraction.denominator = (fraction.denominator / i);
					i--;
				}
			}
		}
		else if (fraction.numerator == fraction.denominator)
		{
			fraction.numerator = 1;
			fraction.denominator = 1;
		}
		
		System.out.print(fraction.numerator + " / " + fraction.denominator);
	}
	public static void main(String[] args)
	{
		Fraction fraction1 = new Fraction(1, 2);
		
		Fraction fraction2 = new Fraction(3, 4);
		
		printFrac(commonTerms(fraction1, fraction2, "-"));
	}
}