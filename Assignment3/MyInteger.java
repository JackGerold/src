package Assignment3;

public class MyInteger {

	private int value;
	// An int data field named value that stores the int value represented by
	// this object.

	public MyInteger() {
		this(0);
		// A constructor that creates a MyInteger object for the specified int
		// value
	}

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// Methods isEven(), isOdd(), and isPrime() that return true if the value is
	// even, odd, or prime, respectively.
	public static boolean isEven(int value) {

		return (value % 2 == 0);
	}

	// Static methods isEven(MyInteger), isOdd(MyInteger), and
	// isPrime(MyInteger) that return true if the specified value is even, odd,
	// or prime, respectively.
	public static boolean isEven(MyInteger value) {
		return isEven(value.getValue());
	}

	public static boolean isOdd(int value) {
		return !isEven(value);
	}

	public static boolean isOdd(MyInteger value) {
		return !isEven(value.getValue());
	}

	public boolean isEven() {
		return isEven(this.value);
	}

	public boolean isOdd() {
		return isOdd(this.value);
	}

	// testing for prime
	public static boolean isPrime(int value) {

		if (value < 2)
			return false; // negative numbers are not prime
		else if (value == 2)
			return true; // 2 is the first prime number
		else if (isEven(value) == true)
			return false; // numbers divisible by 2 (and not 2) are not primes
		else
			for (int factor = 3; factor <= (int) Math.sqrt(value); factor += 2) {
				if (value % factor == 0)
					return false;
			}
		return true;
	}

	public boolean isPrime() {
		// Object method
		return isPrime(this.value);
	}

	// Testing for Equality
	public boolean equals(int value) {
		return (this.value == value);
	}

	public boolean equals(MyInteger value) {
		return equals(value.getValue());
	}

	public static int parseInt(char[] input) {
		return Integer.parseInt(input.toString());

	}

	public static int parseInt(String input) {

		return Integer.parseInt(input);
	}

	public String toString() {
		// toString method to output information
		return ((this.isEven() == true) ? (this.value + " is even and ") : (this.value + " is odd and "))
				+ ((this.isPrime() == true) ? ("is prime.") : ("is not prime."));
	}

	public static void main(String[] args) {

		MyInteger value = new MyInteger(4);
		System.out.println(value);
		value.setValue(7);
		System.out.println(value);
		value.setValue(45);
		System.out.println(value);
		value.setValue(75);
		System.out.println(value);
		value.setValue(parseInt("176"));
		System.out.println(value);
		System.out.println("value equals 176?");
		System.out.println(value.equals(176));
		//System.out.printf("%d%n", MyInteger.parseInt(new char[] {'5', '6',
		//'7'}));

	}

}