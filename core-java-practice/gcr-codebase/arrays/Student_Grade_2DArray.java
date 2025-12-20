
import java.util.Scanner;

public class Student_Grade_2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // here we enter a number of students
        int n=sc.nextInt();

        // b. 2D array for marks and arrays for percentage & grade
        double[][] marks=new double[n][3];
        double[] percentage=new double[n];
        char[] grade=new char[n];

        // c. Take input for marks with validation
        for (int i=0; i<n; i++) {

            System.out.print("Enter Physics marks - ");
            marks[i][0]=sc.nextDouble();
            if (marks[i][0]<0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            System.out.print("Enter Chemistry marks - ");
            marks[i][1]=sc.nextDouble();
            if (marks[i][1]<0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            System.out.print("Enter Maths marks - ");
            marks[i][2]=sc.nextDouble();
            if (marks[i][2]<0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            // here we calculate percentage using 2D array
            percentage[i]=(marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // here we calculate grade
            if (percentage[i]>=80) {
                grade[i]='A';
            } else if (percentage[i] >= 70) {
                grade[i]='B';
            } else if (percentage[i] >= 60) {
                grade[i]='C';
            } else if (percentage[i] >= 50) {
                grade[i]='D';
            } else if (percentage[i] >= 40) {
                grade[i]='E';
            } else {
                grade[i]='R';
            }
        }

        // here we display results
        System.out.println("\n--- STUDENT REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent "+(i + 1));
            System.out.println("Physics: "+ marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%n", percentage[i]);
            System.out.println("Grade: "+grade[i]);
}
}
}

