package week4_starting;

import java.math.BigDecimal;

//import java.awt.Desktop;
//import java.net.URI;

public class Example_FloatingValueInWhile {
	public static void main(String[] args) {
		//double d = .01;
		//double sum2 = 0;
	/*	while(d<=1 ) { // No guarantee item will be 0
			System.out.println("sum"+ sum);
			sum = sum + d;
			System.out.println("sum"+ sum);
			sum++;		
		}*/
		//int x = (int) 2.0;
		//System.out.println(x);
		
		
		double item1 = 0.1;
		double item2 = 0.1;
		double item3 = 0.1;
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.1");
		BigDecimal bd3 = new BigDecimal("0.1");	
		System.out.println(item1 + item2+ item3);
		System.out.println(bd1.add(bd2).add(bd3));
	    System.out.println(BigDecimal.valueOf(item1).add(BigDecimal.valueOf(item2)).add(BigDecimal.valueOf(item3)));

	/*	
		double x1 = 0.3;
		double x2 = 0.1 + 0.1 + 0.1;
		System.out.println(x1 == x2);
		System.out.println(x2);

		double z1 = 0.5;
		double z2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(z1 == z2);
		System.out.println(z2);
		
		double w1 = 0.9;
		double w2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1+ 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(w1 == w2);
		System.out.println(w2);*/
		
	}
}
