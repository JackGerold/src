package week4turnin;

import java.util.Scanner;

public class part3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner


		System.out.print("Enter 3 numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		SortedNumbers(num1, num2, num3);
	}

	
	public static void SortedNumbers(
		double number1, double number2, double number3) {
		double temporary; 
		
		if (number2 < number1 && number2 < number3){
			temporary = number1;
			number1 = number2;
			number2 = temporary;
		}
		else if (number3 < number1 && number3 < number2) {
			temporary = number1; 
			number1 = number3;
			number3 = temporary;
		}
		if (number3 < number2) {
			temporary = number2;
			number2 = number3;
			number3 = temporary;
		}
		
		
		System.out.println(number1 + " " + number2 + " " + number3);
	}
}