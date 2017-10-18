package week2;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
//the information for the classes in an imported package is not read in at compile time or runtime unless the class is used in the program
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) throws IOException {	
		System.out.println(System.out);
		
		System.out.println(System.in);
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader keyboard = new BufferedReader(in);
		System.out.println("Enter number 1:");
		String s = keyboard.readLine();
		System.out.println(s);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 2:");
		double s2 = input.nextDouble();
		System.out.println(s2);
		
	}



}
