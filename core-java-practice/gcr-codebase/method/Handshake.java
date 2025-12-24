

import java.util.Scanner;

public class Handshake {
    // Method to calculate maximum handshakes
    public static int calculate_Handshakes(int num_Of_Students) {
        return (num_Of_Students * (num_Of_Students - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input no of students
        int num_Of_Students = sc.nextInt();

        // Calculate handshakes
        int handshakes = calculate_Handshakes(num_Of_Students);

        // Display 
        System.out.println(
            "Maximum number of possible handshakes among " +num_Of_Students + " students is " + handshakes );
    }
}