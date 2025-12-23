
import java.util.Scanner;

public class Percentage_Grade {

    // Method to generate random marks for Physics, Chemistry, Math
    static int[][] generateMarks(int No_of_Students) {
        int[][] marks = new int[No_of_Students][3];
        for (int i = 0; i < No_of_Students; i++) {
            for (int j = 0; j < 3; j++) {
                // Random marks between 10 and 99
                marks[i][j] = (int) (Math.random() * 90 + 10);
            }
        }
        return marks;
    }

    // Method to calculate Total, Average, and Percentage
    static double[][] calculateStats(int[][] marks) {
        double[][] stats = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;

            // 2 decimal tak round off karne ke liye round of method use kiya hai hamne
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    //Method to calculate Grade based on percentage
    static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2]; // Percentage
            if (p >= 80) grades[i][0] = "A";
            else if (p >= 70) grades[i][0] = "B";
            else if (p >= 60) grades[i][0] = "C";
            else if (p >= 50) grades[i][0] = "D";
            else if (p >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    //Method to display the Scorecard in tabular format
    static void displayScorecard(int[][] marks, double[][] stats, String[][] grades) {
        System.out.println("\nID  Phy  Chem  Math  Total  Avg  Perc%  Grade");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "  ");
            System.out.print(marks[i][0] + "  " + marks[i][1] + "  " + marks[i][2] + "  ");
            System.out.print(stats[i][0] + "  " + stats[i][1] + "  " + stats[i][2] + "%  ");
            System.out.println(grades[i][0]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//no. of student input kraaenge

        // Calling all methods step-by-step
        int[][] allMarks = generateMarks(n);
        double[][] allStats = calculateStats(allMarks);
        String[][] allGrades = calculateGrades(allStats);

        displayScorecard(allMarks, allStats, allGrades);
    }
}