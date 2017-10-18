package week3_starting;

import java.util.Scanner;

public class Activity8_javaSubStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string :\n");
		 input = new Scanner(System.in);
	     String s1 = input.next();
	     System.out.println("s1: " + s1);
	     String s = "Kim Jones";
	     int k = s.indexOf(' ');
	     k = 3;
	     String firstName = s.substring(0, k);
	     String lastName = s.substring(k + 1);
	     System.out.println("firstName: " + firstName);
	     System.out.println("lastName: " + lastName);
	}

}
