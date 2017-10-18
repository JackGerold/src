package week5;

public class Example1_ArrayDeclaration {

	public static void main(String[] args) {
		//declare single dimensional array 
		int[] x; new int [3];
		x[0]=2;
		x[1]=3;
		x[2]=3;
		x[4]=3;
		//int[] myInt = new int[12];
		//myInt[11] = 4;
		//System.out.println(myInt[11]);
		// what is the maximun index value of myInt ?
		// what type of error ? syntax, runtime, logical ?
		// how do you increase the length of an array 
		
		double[] myDouble = {2, 4, 5, 6 };
		//System.out.println(myDouble.length);
		for(int i = 0; i<= myDouble.length; i++){
			System.out.println(myDouble[i]);
		}
	
		
		//int[] a = {1,2,3};
		//int[] b = a.clone();
		//System.out.println(b[1]);
		
		
		
		//Using the shorthand notation, you have to declare, create, and initialize the array all in one statement. 
		//Splitting it would cause a syntax error. For example, the following is wrong:
        //int[] myNumbers = {8, 2, 3, 4, 6, 7};
        //System.out.println(myNumbers[1]);
		
		

		
		
	}

}
