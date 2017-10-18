package week5turnin;

import java.util.Scanner;

public class problem2 {

    static final int MAX = 100;
    public static void main(String[] args) {

        int[] scores = new int[MAX];
        int numScores = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the grade values, and input a negative number to end: ");
        for (int i = 0; i < MAX; i++) {

            int num = input.nextInt();

            if (num < 0)  break;

            scores[i] = num;
            numScores++;
        }
        scores[numScores] = -1; 
        int average = getAverage(scores, numScores);
        int aboveequal = scoresAbove(scores, average);

        System.out.println("The Number of scores is: " + numScores);
        System.out.println("The Average score is: " + average);
        System.out.println("The Scores above average are: " + aboveequal);
        System.out.println("The Scores below average are: " + (numScores - aboveequal));
        input.close();
    }

    public static int getAverage(int[] scores, int numScores) {
        int total = 0;
        for (int i = 0; scores[i] >= 0; i++) {
            total += scores[i];
        }

        return total / numScores;
    }

    public static int scoresAbove(int[] scores, int average) {
        int count = 0;
        for (int i = 0; scores[i] >= 0; i++) {

            if (scores[i] >= average) count++;
        }

        return count;
        
    }
}