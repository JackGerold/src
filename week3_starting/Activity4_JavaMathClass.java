package week3_starting;
public class Activity4_JavaMathClass {
    public static void main(String[] args) {
        double a = -191.635523;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n", 
                          a, abs());

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                          b, ceil());

        System.out.printf("The floor of " + "%.2f is %.0f%n", 
                          b, floor());

        System.out.printf("The max of %d and " + "%d is %d%n",
                          c, d, max());

        System.out.printf("The min of of %d " + "and %d is %d%n",
                          c, d, Math());
    }
}