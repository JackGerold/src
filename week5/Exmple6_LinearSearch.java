package week5;

public class Exmple6_LinearSearch {

	public static void main(String[] args) {
		int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
		int i = linearSearch(list, 4);  // returns 1
		System.out.println(i);
		int j = linearSearch(list, -4); // returns -1
		System.out.println(j);
		int k = linearSearch(list, -3); // returns 5
		System.out.println(k);


	}

	/** The method for finding a key in the list */
	public static int linearSearch(int[] list, int key) {
	  for (int i = 0; i < list.length; i++)
	    if (key == list[i])
	      return i;
	  return -1;
	}

	
}
