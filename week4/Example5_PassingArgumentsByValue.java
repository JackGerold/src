package week4;

public class Example5_PassingArgumentsByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String studentName  = "Mary";
	   System.out.println(studentName);
	   getName(studentName);
	}
	
	public static void getName(String name) {
		
		System.out.println("name: " + name);
		
	}

}
