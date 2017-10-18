package week2;
public class Example3 {
	// class variable
	public static String DEPARTMENT = "ics";
	// instance variable
	private String name;

	public Example3(String name) {
		this.name = name;
	}

	public void getAge() {
		// local variable
		int age = 34;
		System.out.println("Age: " + age);
		System.out.println("name: " + name);
		System.out.println("Department: " + DEPARTMENT);
	}

	public void getAge2() {
		// local variable
		
		System.out.println(name);
	}
	public static void main(String[] args) {

		Example3 e1 = new Example3("Jack");
		System.out.println(e1);
		e1.getAge();
		System.out.println(DEPARTMENT);
		Example3 e2 = new Example3("Brutus");
		System.out.println(e2);
		e2.getAge();
		System.out.println(DEPARTMENT);
		
		
	}

}
