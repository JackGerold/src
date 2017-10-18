package week4;

import java.util.Scanner;
//convert the following for loop into a sentinel loop  
public class Exsmple2_SentinelValue  {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int balance = 0;
		System.out.print("Enter amount to add or type '0' to end the addition\n ");
		int amount = input.nextInt();
		while (amount != 0) {
		//for (int i=0; i<= 10; i++) {
			balance = balance + amount;
			System.out.println("Balance " + balance + " \nAdd more or type '0' to end the addition\n");
			amount = input.nextInt();
		}
	}
}