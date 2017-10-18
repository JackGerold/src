package week3_starting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// read a number from a text file
// check if the number is even or odd and print out the result
// sample output 6: is an even number, 5: 5 is an odd number
public class Activity2 {
	private Scanner x;
	public void openFile() {
		try {
			x = new Scanner(new File("abc.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void readFile() {
		while (x.hasNext()) {
			int a = x.nextInt();
			// print out a :System.out.printf("%s\n", a);
			//check if a is even or odd, if else	
		}
	}

	public void closeFile() {
		// close the file
	}

	public static void main(String[] args) {
	// create instance of the object
	// call each method
	}
}
