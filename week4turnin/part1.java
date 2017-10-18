package week4turnin;

public class part1 {

    public static void main(String[] args) {

        int n = 0;

        while (Math.pow(n, 3) < 12000) {
            n++;
        }
        n--;
        System.out.println(n + " is the largest possible integer n, such that n^3 is less than 12,000");

    }
}