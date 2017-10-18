package week2;

public class Example4 {
	
	public static void main(String[] args) {
		int y = 5;
		y += y + 4;
		//System.out.println(y);
		
		int z = 5;
		System.out.println(z++);
		
		Integer integer = new Integer(5);
		Number n = integer;
		// widening
		System.out.println(n);
		int m = 7;
		System.out.println(m++);
	}

}
