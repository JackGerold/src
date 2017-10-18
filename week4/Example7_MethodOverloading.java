package week4_starting;

	public class Example7_MethodOverloading {
	   public static void main(String[] args) {
		  MyVehicle mycar = new MyVehicle();
	      mycar.getCarInfo();;
	      mycar.getCarinfo(4);
	      mycar.getCarinfo("My Car", 6);
	      
	      //Overloaded constructor:
	      new MyVehicle();
	   }
	}