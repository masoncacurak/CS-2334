import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {
	
	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}
	
	public static String main(String s) {
		String fin = "Overloaded main method was passed \"" + s + "\".";
		
		
		return fin;
	}
	//dividing two doubles
	public static double divide(double a, double b) {
		return a/b;
	}
	//dividing two ints
	public static int divide(int a, int b) {
		return a/b;
	}
	//testing if an int is divisible by 7
	public static boolean isDivisibleBy7(int a) {
		if (a % 7 == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	//find minimum value of 3 ints
	public static int findMin(int a, int b, int c) {  
		int minValue = a;
		if (a > b && b < c) {
			minValue = b;
		}
		else if (b > c && c < a) {
			minValue = c;
		}
		
		return minValue;
	}
	//find minimum value from an array
	public static int findMin(int[] elements) {
		int minValue = elements[0];
		for (int i = 1; i < elements.length; i++) {
			if (elements[i] < minValue) {
				minValue = elements[i];
			}
		}
		return minValue;
	}
	//find average value of array elements
	public static double average(int[] array) {
		double total = 0.0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		return total / array.length;
	}
	//change upper case string array to lower case 
	public static String[] toLowerCase(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].toLowerCase();
		}
		return strings;
	}
	//make a copy of changed lower case string array 
	public static String[] toLowerCaseCopy(String[] array) {
		String[] duplicate = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			duplicate[i] = array[i].toLowerCase();
		}
		return duplicate;
	}
	//change duplicate value to 0
	public static int[] removeDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == temp && j != i) {
				array[j] = 0;
				count++;
				}
				if (count > 0) {
					array[i] = 0;
				}
			}
		}
		return array;
	}
}	
	
	
