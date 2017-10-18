package week3_starting;

public class Activity9_DesimalPointFormatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 1e2;
		System.out.printf( "%.2f\n" , f);
		float f1 = 1f;
		System.out.printf( "%.2f\n" , f1);
		double f2 = 3.0f;
		System.out.printf( "%.2f\n" , f2);
		float f3 = 4.754f;
		System.out.printf( "%.2f\n" , f3);
	    float k = f +f1+f2+f3 ;
	    System.out.print(k);
	 System.out.printf( "\n%.2f", k);
		
	}

}
