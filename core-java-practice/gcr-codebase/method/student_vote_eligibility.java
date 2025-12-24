
import java.util.Scanner;

public class student_vote_eligibility {

    // Method that check voting eligibility
    public boolean canStudentVote(int age) {

        // Validate negative age
        if (age < 0) {
            return false;
        }

        // Check voting condition
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

         //here we create main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        student_vote_eligibility checker = new student_vote_eligibility();

        // here we take ages input for 10 students
        for (int i = 0; i < ages.length; i++) {
            
            ages[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < ages.length; i++) {

            boolean canVote = checker.canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Student Invalid age");
            } else if (canVote) {
                System.out.println("Student Can vote");
            } else {
                System.out.println("Student Cannot vote");
            }
        }
    }
}
