package week4_starting;

import java.util.Scanner;

public class Example6A_ModularityExample {
	  public static void main(String[] args) {
		    // Create a Scanner
		    Scanner input = new Scanner(System.in);
		    // Prompt the user to enter two integers
		    System.out.print("Enter first integer: ");
		    int n1 = input.nextInt();
		    System.out.print("Enter second integer: ");
		    int n2 = input.nextInt();

		    System.out.println("The greatest common divisor for " + n1 +
		      " and " + n2 + " is " + GreatestCommonDivisorMethod.gcd(n1, n2));
		  }
}
