package week5;

public class Example2_ForEach {

	public static void main(String[] args) {
		int[] myInt = { 2, 1, 15, 7 };
		// Print all the array elements
		for (int myNumber : myInt) {
			System.out.println(myNumber);
		}
	
		// Finding the largest element
		double max = myInt[0];
		for (int i = 1; i < myInt.length; i++) {
			if (myInt[i] > max)
				max = myInt[i];
		}
		System.out.println("Max is " + max);
		
		// can you find the minimum value from the above array
		// assume the minimum is int min = myInt[0];
		// for int i = 0 to int myInt length 
		// if the value of a number at the index 0 is less than minimum 
		// minimum is the value of a number at the index 0
        
	}

}
