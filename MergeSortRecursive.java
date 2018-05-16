import java.util.Scanner;

public class MergeSortRecursive 
{
	public static void split(int[] otherArray, int minimum, int maximum, int[] unsortedArray)
	{
		if (maximum - minimum < 2)
		{
			return;
		}
		
		int middle = (maximum + minimum) / 2;
		
		split(unsortedArray, minimum, middle, otherArray);
		split(unsortedArray, middle, maximum, otherArray);
		merge(otherArray, minimum, middle, maximum, unsortedArray);
	}
	
	public static void merge(int[] unsortedArray, int minimum, int middle, int maximum, int[] otherArray)
	{
		int i = minimum, j = middle;
	    
	    for (int k = minimum; k < maximum; k++) 
	    {
	        if (i < middle && (j >= maximum || unsortedArray[i] <= unsortedArray[j]))
	        {
	        	otherArray[k] = unsortedArray[i];
		        i++;
	        }
	        else 
	        {
	            otherArray[k] = unsortedArray[j];
	            j++;    
	        }
	    } 
	}
	
	public static void main(String[] args)
	{		
		Scanner testScanner = new Scanner(System.in);
		System.out.println("Enter the number of variables in array to merge sort");
		int length = testScanner.nextInt();
		
		int[] unsortedArray = new int[length];
		
		for (int i = 0; i <= length - 1; i++)
		{
			System.out.println("Enter variable");
			unsortedArray[i] = testScanner.nextInt();
		}
		
		testScanner.close();
		
		int[] otherArray = new int[length];
		
		for(int k = 0; k <= length - 1; k++)
		{
			 otherArray[k] = unsortedArray[k];
		}
		
		split(otherArray, 0, length, unsortedArray);
		
		System.out.println("Sorted list is ");
		for (int i = 0; i <= length - 1; i++)
		{
			System.out.print(unsortedArray[i] + " ");
		}
		
		System.out.println("");
	}
}