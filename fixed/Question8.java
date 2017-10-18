package fixed;
import java.util.Scanner;
public class Question8 {
	  public static void main(String[] args) {
	    
		
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number in pounds: ");
	    double pounds = input.nextInt();
	    input.close();
	    double kilograms = pounds * 0.454;

	    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	  }

	
	
	}
