package week5turnin;

import java.util.Scanner;

public class problem1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		int[] a = new int[10];
		for (int b = 0; b < 10; b++)
			a[b] = input.nextInt();
		for (int b = a.length - 1; b >= 0; b--)
			System.out.print(a[b] + " ");
		input.close();
	}
}