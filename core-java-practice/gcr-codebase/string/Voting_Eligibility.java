
import java.util.Scanner;

public class Voting_Eligibility {

    // Take ages of n students and return 1D array
    public static int[] getStudentAges(int n, Scanner sc) {
        int[] ages = new int[n];
          //here we take input of ages of the student
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Create 2D array of age and voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // age as String

            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // : Display 
    public static void displayTable(String[][] table) {

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        //  Get ages
        int[] ages = getStudentAges(numberOfStudents, sc);

        //  Check voting eligibility
        String[][] votingResult = checkVotingEligibility(ages);

        //Display result
        displayTable(votingResult);

    }
}
