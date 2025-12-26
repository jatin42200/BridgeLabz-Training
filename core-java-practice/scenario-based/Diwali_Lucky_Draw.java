
import java.util.Scanner;

public class Diwali_Lucky_Draw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalVisitors = 0;
        int winners = 0;
        
        System.out.println("<---DIWALI MELA LUCKY DRAW --->");
        System.out.println("Draw a number between 1-100!");
        System.out.println("Win if your number is divisible by BOTH 3 and 5 ");
        System.out.println("Enter -1 to end the lucky draw\n");
        
        while (true) {
            System.out.print("Visitor " + (totalVisitors + 1) + ", enter your lucky number: ");
            
            // Check if input is valid integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.\n");
                sc.next(); // Clear invalid input
                continue;
            }
            
            int number = sc.nextInt();
            
            // Exit condition
            if (number == -1) {
                break;
            }
            
            // Validate number range
            if (number < 1 || number > 100) {
                System.out.println(" Invalid number! Please enter between 1-100.\n");
                continue;
            }
            
            totalVisitors++;
            
            // Check if divisible by both 3 and 5 using modulus
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println( "CONGRATULATIONS! You won a gift!");
                System.out.println("Your number " + number + " is divisible by both 3 and 5!\n");
                winners++;
            } else if (number % 3 == 0) {
                System.out.println("Close! Your number is divisible by 3 but not 5. Better luck next time!\n");
            } else if (number % 5 == 0) {
                System.out.println("Close! Your number is divisible by 5 but not 3. Better luck next time!\n");
            } else {
                System.out.println("Sorry! Your number is not divisible by both 3 and 5. Try again!\n");
            }
        }
        
        // Display final statistics
        System.out.println("\n=== LUCKY DRAW RESULTS ===");
        System.out.println("Total Visitors: " + totalVisitors);
        System.out.println("Total Winners: " + winners);
        if (totalVisitors > 0) {
            double winPercentage = (winners * 100.0) / totalVisitors;
            System.out.printf("Win Rate: %.2f%%\n", winPercentage);
        }
        System.out.println("Happy Diwali! ");
    }
}