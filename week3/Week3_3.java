package week3;

import java.text.DecimalFormat;

public class Week3_3 {
    public static void main(String[] args) {

	int numArgs = args.length;

	
        if (numArgs < 2) {
            System.out.println("Please type two.");
        } else {
	    double sum = 0.0;

	    for (int i = 0; i < numArgs; i++) {
                sum += Double.valueOf(args[i]).doubleValue();
	    }

	    
	    DecimalFormat myFormatter = new DecimalFormat("###,###.##");
	    String output = myFormatter.format(sum);

	    
            System.out.println(output);
        }
    }
}