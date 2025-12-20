
import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // here we enter Number of students
        int n = sc.nextInt();

        // b. Arrays to store data
        double[] physics=new double[n];
        double[] chemistry=new double[n];
        double[] maths=new double[n];
        double[] percentage=new double[n];
        char[] grade = new char[n];

        // here we take input for marks with validation
        for (int i=0; i<n; i++) {

            System.out.print("Enter Physics marks -");
            physics[i]=sc.nextDouble();
            if (physics[i]<0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            System.out.print("Enter Chemistry marks - ");
            chemistry[i] = sc.nextDouble();
            if (chemistry[i]<0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            System.out.print("Enter Maths marks  - ");
            maths[i] = sc.nextDouble();
            if (maths[i]<0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            // here we calculate percentage
            percentage[i]=(physics[i]+chemistry[i]+maths[i])/3;

            // here we Calculate grade
            if (percentage[i]>=80) {
                grade[i]='A';
            } else if (percentage[i]>=70) {
                grade[i]='B';
            } else if (percentage[i]>= 60) {
                grade[i]='C';
            } else if (percentage[i]>=50) {
                grade[i]='D';
            } else if (percentage[i]>=40) {
                grade[i]= 'E';
            } else {
                grade[i]='R';
            }
        }

        // here we Display result
        System.out.println("\n--- STUDENT REPORT ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + physics[i]);
            System.out.println("Chemistry: " + chemistry[i]);
            System.out.println("Maths: " + maths[i]);
            System.out.printf("Percentage: %.2f%n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }
    }
}
