import java.util.*;

public class Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        
        // Take user input for age Of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i+1)+ ": ");
            ages[i] = sc.nextInt();
        }
        
        // Check voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Student "+(i+1)+": Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("Student "+(i+1)+ " is eligible to vote");
            } else {
                System.out.println("Student "+(i+1)+ "is not eligible to vote");
            }
        }
    }
}