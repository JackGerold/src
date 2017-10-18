package fixed;

public class Question10 {
	  public static void main (String[] args) {
	    java.util.Scanner input = new java.util.Scanner(System.in);
	    double[] num = new double[10];
	    for (int i = 0; i < 10; i++) {
	      
	      System.out.print(
	        "Read a number: ");
	      num[i] = input.nextInt();
	      input.close();
	    }
	    for (int i = 9; i >= 0; i--) {
	      System.out.println(num[i]);
	    }
	  }
	}
