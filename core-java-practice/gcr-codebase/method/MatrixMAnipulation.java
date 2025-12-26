

public class MatrixMAnipulation {

    // Generates random 2-digit scores (10-99) for students in PCM subjects
    public static int[][] generatePCMScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; 
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                // Generates random scores between 10 and 99
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    // Method to determine Grade and Remarks based on percentage
    public static String getGradeInfo(double percentage) {
        if (percentage >= 80) {
            return "Grade: A | Remarks: (Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            return "Grade: B | Remarks: (Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            return "Grade: C | Remarks: (Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            return "Grade: D | Remarks: (Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            return "Grade: E | Remarks: (Level 1- , too below agency-normalized standards)";
        } else {
            return "Grade: R | Remarks: (Remedial standards)";
        }
    }

    public static void main(String[] args) {
        int numStudents = 5; // Example input
        int[][] scores = generatePCMScores(numStudents);

        System.out.println("Student Report Card (Physics, Chemistry, Maths)");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            int p = scores[i][0];
            int c = scores[i][1];
            int m = scores[i][2];
            int total = p + c + m;
            double average = total / 3.0; //

            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Scores: P=" + p + ", C=" + c + ", M=" + m);
            System.out.println("  Total: " + total + " | Average: " + average);
            System.out.println("  " + getGradeInfo(average));
            System.out.println("--------------------------------------------------");
        }
    }
}