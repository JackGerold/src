package week3;

public class Week3_2 {
    public static void main(String[] args ) {
	int numberArgs = args.length;

	
        if (numberArgs < 2) {
            System.out.println("Please, type two numbers.");
        } else {
	    int sum = 0;

	    for (int i = 0; i < numberArgs; i++) {
                sum += Integer.valueOf(args[i]).intValue();
	    }

            System.out.println(sum);
        }
    }
}