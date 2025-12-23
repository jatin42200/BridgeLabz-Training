
import java.util.Scanner;

public class R_P_C_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.print("Kitne rounds khelne hain? ");
        int n = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Round " + i + " ---");
            System.out.print("Enter choice (0 for Rock, 1 for Paper, 2 for Scissors) ");
            int userChoice = sc.nextInt();

            // Computer choice (0, 1, or 2)
            int compChoice = (int) (Math.random() * 3);

            System.out.println("You chose--> " + options[userChoice]);
            System.out.println("Computer chose--> " + options[compChoice]);

            // Winner Logic
            if (userChoice == compChoice) {
                System.out.println("Result It is a Draw!");
            } else if ((userChoice == 0 && compChoice == 2) || 
                       (userChoice == 1 && compChoice == 0) || 
                       (userChoice == 2 && compChoice == 1)) {
                System.out.println("Result You Win ");
                userWin++;
            } else {
                System.out.println("Result Computer Wins ");
                compWin++;
            }
        }

        // Final Summary
        System.out.println("FINAL SCORE:");
        System.out.println("User: " + userWin + " | Computer " + compWin);
        
        if(userWin > compWin) System.out.println("Overall Winner YOU! ");
        else if(compWin > userWin) System.out.println("Overall Winner COMPUTER! ");
        else System.out.println("Overall Result: IT'S A TIE ");
    }
}
