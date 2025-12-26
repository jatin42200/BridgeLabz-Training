
import java.util.Scanner;

public class GradeCalculator {

    // Method to generate random 2-digit scores (10-99) for PCM
    public static int[][] generatePCMScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 columns for Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                // Generate random 2-digit number: 10 to 99
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    // Method to determine Grade and Remarks based on percentage
    public static void displayGradeInfo(double percentage) {
        String grade, remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "(Level 1- , too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        System.out.printf(" | %-5s | %-10.2f%% | %-5s | %s\n", " ", percentage, grade, remarks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[][] studentMarks = generatePCMScores(n);

        System.out.println("\n" + "=".repeat(110));
        System.out.printf("%-10s | %-7s | %-7s | %-7s | %-7s | %-11s | %-5s | %-40s\n", 
                          "Student", "Phys", "Chem", "Math", "Total", "Percentage", "Grade", "Remarks");
        System.out.println("-".repeat(110));

        for (int i = 0; i < n; i++) {
            int p = studentMarks[i][0];
            int c = studentMarks[i][1];
            int m = studentMarks[i][2];
            
            int total = p + c + m;
            double percentage = total / 3.0; // Since max marks per sub is 100

            System.out.printf("Student %-2d | %-7d | %-7d | %-7d | %-7d", (i + 1), p, c, m, total);
            displayGradeInfo(percentage);
        }
        System.out.println("=".repeat(110));
    }
}