package week2;

public class Example7 {

	public static void main(String[] args) {
		int x = 5;
		x +=  4;
		System.out.println(x);
		
		int y = 5;
		   
		   y= ++y;
		  //preincrements increments then declares value
		 System.out.println(y);
		 y= y++;
		   //postincrement declares value then increments, why does this not increment?
		 System.out.println(y);
		 y= ++y;
		   //postincrement declares value then increments
		 System.out.println(y);
	}

}
