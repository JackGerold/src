package fixed;
import java.util.Scanner;
public class Question15 {

	    public static void main(String[] Strings) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Input an integer between 1000 and 10000: ");
	        int num = input.nextInt();

	        int digit1 = num % 10;
	        int remainder = num / 10;
	        int digit2 = remainder % 10;
	        remainder = remainder / 10;
	        int digit3 = remainder % 10;
	        remainder = remainder / 10;
	        int digit4 = remainder % 10;
	        remainder = remainder / 10;
	        int sum = digit4 + digit3 + digit2 + digit1;
	        input.close();
	        System.out.println("The sum of all digits in " + num + " is " + sum);

	    }
	}