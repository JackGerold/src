package Assignment3;

public class MyString {

	public static void main(String args[]) {
		//initialize strings
String string1= "Where there is a will, there is a way.";
String string2= "Programming is fun";
String string3= "you should work to earn it";
//compare strings
    int result = string1.compareTo( string2 );
    System.out.println(result);
    result = string2.compareTo( string3 );
    
    System.out.println(result);
    
    String string4 = string1.concat(string2);
    //create string4 out of concatenated string1 and string2
	System.out.println(string4);
	
	System.out.println(string1 + " equals " + string2 + " -> " + string1.equals(string2));
	//equals method
	string3 = string3.replace('y', 'l');
	System.out.println(string3);
	//replace method
	}
}	
//9.4 9.5 9.7 homework for 10/4