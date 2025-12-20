import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // here we take user input
        int num = sc.nextInt();
        
        // here we check no. should be positive
        if (num <= 0) {
            System.out.println("Please enter a positive integer!!!");
            return;
        }
        
        //here we create String array to save results
        String[] results = new String[num + 1];
        
        // Loop from 0 to number and apply FizzBuzz logic
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // here we display results
        for (int i = 0; i <= num; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}