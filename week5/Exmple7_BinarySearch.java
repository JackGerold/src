package week5;

public class Exmple7_BinarySearch {

	public static void main(String[] args) {
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = binarySearch(list, 4);  // returns 1
		System.out.println(i);
		int j = binarySearch(list, -4); // returns -1
		System.out.println(j);
		int k = binarySearch(list, -3); // returns 5
		System.out.println(k);
	}

	public static int binarySearch(int[] list, int key) {
		  int low = 0;
		  int high = list.length - 1;
		  while (high >= low) {
		    int mid = (low + high) / 2;
		    if (key < list[mid])
		      high = mid - 1;
		    else if (key == list[mid])
		      return mid;
		    else
		      low = mid + 1;
		  }
		  return -1 - low;
		}


	
}
