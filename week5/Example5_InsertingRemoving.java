package week5;

public class Example5_InsertingRemoving {

	public static void main(String[] args) {
		// Array of physical size 12
		// declare array, at this point all elements are 0
		int[] values = new int[12];
		// add some elements to the array
		values[0] = 1;
		values[1] = 3;
		values[2] = 4;
		values[3] = 6;
		values[4] = 8;
		// how many elements are being used ?

		// number of used arrays
		int logicalSize = 5;
		// elements we want to remove
		int target = 2;

		// loop from the targeIndex to the logical end of the array
		for (int i = target; i < logicalSize - 1; i++) {
			// copy the next element into this position
			values[i] = values[i + 1];
		}
		// reset the last elements to zero
		values[logicalSize - 1] = 0;
		// decreese the logical size
		logicalSize--;
	}

}
