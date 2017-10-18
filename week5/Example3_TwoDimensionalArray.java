package week5;

public class Example3_TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] myDoubleNumbers = new double[3][4];
		myDoubleNumbers[0][1] = 3;
		System.out.println(myDoubleNumbers[0][1]);
		
		
		int myIntNumbers[][]={{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}, {72,66,77,80,69}};
		System.out.println(myIntNumbers[1][2]);
		System.out.println("The length of the array: " + myIntNumbers.length);


		
	}

}
