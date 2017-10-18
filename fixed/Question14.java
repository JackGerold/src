package fixed;
import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three Integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		input.close();

		int big;
		if (num2 < num1 || num3 < num1)
		{
			if (num2 < num1)
			{
				big = num1;
				num1 = num2;
				num2 = big; 
			}
			if (num3 < num1)
			{
				big = num1;
				num1 = num3;
				num3 = big;
			}
		}
		if (num3 < num2)
		{
			big = num2;
			num2 = num3;
			num3 = big;
		}

		
		System.out.println("The numbers in increasing order are "+ num1 + " " + num2 + " " + num3);
		
	}
}