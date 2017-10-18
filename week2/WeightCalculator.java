package week2;

import java.util.Scanner;

public class WeightCalculator {

	public static double GRAVITY = 9.8;
	{
	}

	public static void main(String[] args) {
		double mass;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter mass of object:");
		mass = s.nextDouble();
		double weight = mass * GRAVITY;
		System.out.println("Weight is " + weight
				+ ", Weight = mass*gravity while gravity is constant and has a value of approximately 9.8  m/s**2");
	}

}
