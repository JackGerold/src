package fixed;

public class Question9 {
	public static void main(String[] args) {

		int number = (int) (Math.random() * 2);

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Guess head or tail? " + "Enter 0 for head and 1 for tail: ");
		int guess = input.nextInt();
		input.close();
		if (guess == number)
			System.out.println("Correct guess");
		else if (number == 0)
			System.out.println("Sorry, it is a head");
		else
			System.out.println("Sorry, it is a tail");
	}
}