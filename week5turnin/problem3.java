package week5turnin;

import java.util.Scanner;


public class problem3 {

    static final int NAME = 0;
    static final int SCORE = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = input.nextInt();
        String[][] students = new String[2][size];

        for (int i = 0; i < students[SCORE].length; i++) {
            System.out.print("Enter student number "+ (i + 1) + "'s name: " );
            students[NAME][i] = input.next();
            System.out.print("Enter student number "+ (i + 1) + "'s score: " );
            students[SCORE][i] = input.next();
        }
        sort(students);
        printArray(students);
        input.close();
    }

    public static void sort(String[][] students) {

        for (int i = 0; i < students[SCORE].length - 1; i++) {

            int currentIndex = i;
            int currentMin = new Integer(students[SCORE][i]);
            String name = "";
            for (int j = i + 1; j < students[SCORE].length; j++) {

                if (currentMin > Integer.parseInt(students[SCORE][j])) {
                    currentMin = Integer.parseInt(students[SCORE][j]);
                    name = students[NAME][j];
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                students[NAME][currentIndex] = students[NAME][i];
                students[SCORE][currentIndex] = students[SCORE][i];
                students[NAME][i] = name;
                students[SCORE][i] = Integer.toString(currentMin);
            }
        }

    }

    public static void printArray(String[][] array) {

                for (int i =  array[SCORE].length - 1; i >= 0; i--) {

                    System.out.println("Student: " + array[NAME][i] + " Score: " + array[SCORE][i]);

                }
    }
}