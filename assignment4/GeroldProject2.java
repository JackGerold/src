package assignment4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GeroldProject2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		// Generates 10 Random Numbers in the range 1 -100
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 99 + 1);
		}
		// end for loop

		// sort array
		Arrays.sort(numbers);

		// print all the elements available in list
		System.out.println("Binary Search\nEnter x to exit");
		System.out.println("Random Numbers: " + Arrays.toString(numbers));

		Scanner scan = new Scanner(System.in);
		int guess = 0;
		// entering the value to be searched

		boolean good = false;
		while (good == false) {
			int number = 1;

try {
			System.out.print("Please input an integer from 1 to 100:");
			guess = (int) scan.nextDouble();
}
			catch (InputMismatchException exception) 
			{ 
			    System.out.println("Integers only please, or enter x to exit."); 
			    scan.nextLine();
			    
			} 

			
			int index = Arrays.binarySearch(numbers, guess);
			if (index >= 0) {
				System.out.print(guess + " is in random numbers.");
				good = true;
			} else if (index < 0) {
				System.out.print(guess + " is not in random numbers.");
			}

		}
	}

}
