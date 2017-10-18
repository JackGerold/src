package week5;

import java.util.Arrays;

public class Example4_PassingArrayToMethod {

	public static void main(String[] args) {
		int[] data = { 23, 42, 72, 14 };
		// System.out.print("Original elemeets of the array: " );
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

		// double each element of data
		doubleAll(data); // Call by REFERENCE
		for (int i = 0; i < data.length; i++) {
			System.out.println("\nAfter Doubling the array elements: " + data[i]);
		}

		int[] A = printArray();
		System.out.println("\nBefore : " + Arrays.toString(A));

		printArray(new int[] { 3, 1, 2, 6, 4, 2 });

	}

	// Doubles each element of the specified array
	public static void doubleAll(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}
	}

	public static int[] printArray() {
		int[] A = { 1, 2, 3 };
		return A;
	}

	public static int[] printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			//System.out.print(array[i] + " ");
		}
		return array;
	}

/*	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		      System.out.print(result[i] + " ");
		   }
		   return result;
		}*/

	
}
