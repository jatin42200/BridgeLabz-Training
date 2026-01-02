import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("-----------------------------------------");
        System.out.println("     STUDENT TEST SCORES MANAGER");
        System.out.println("-----------------------------------------\n");
        
        // Input number of students
        int numStudents = 0;
        while (true) {
            try {
                System.out.print("Enter number of students: ");
                numStudents = sc.nextInt();
                
                if (numStudents <= 0) {
                    System.out.println("Error: Number must be positive!\n");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number!\n");
                sc.next(); // Clear invalid input
            }
        }
        
        // Array to store scores
        double[] scores = new double[numStudents];
        
        // Input scores with validation
        inputScores(sc, scores);
        
        // Calculate and display statistics
        displayStatistics(scores);
    }
    
    // Method to input scores with validation
    public static void inputScores(Scanner sc, double[] scores) {
        System.out.println("\n--- Enter Test Scores ---");
        System.out.println("(Scores should be between 0 and 100)\n");
        
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                try {
                    System.out.print("Student " + (i + 1) + " score: ");
                    double score = sc.nextDouble();
                    
                    // Validate score
                    if (score < 0) {
                        System.out.println("Error: Score cannot be negative!\n");
                        continue;
                    }
                    if (score > 100) {
                        System.out.println("Error: Score cannot exceed 100!\n");
                        continue;
                    }
                    
                    scores[i] = score;
                    break;
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid number!\n");
                    sc.next(); // Clear invalid input
                }
            }
        }
    }
    
    // Method to display all statistics
    public static void displayStatistics(double[] scores) {
        System.out.println("\n------------------------------------------");
        System.out.println("            SCORE STATISTICS");
        System.out.println("------------------------------------------\n");
        
        // Display all scores
        System.out.println("All Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student %d: %.2f\n", (i + 1), scores[i]);
        }
        
        // Calculate average
        double average = calculateAverage(scores);
        System.out.println("\n-------------------------------------------");
        System.out.printf("Average Score      : %.2f\n", average);
        
        // Find highest score
        double highest = findHighest(scores);
        System.out.printf("Highest Score      : %.2f\n", highest);
        
        // Find lowest score
        double lowest = findLowest(scores);
        System.out.printf("Lowest Score       : %.2f\n", lowest);
        
        // Display scores above average
        displayAboveAverage(scores, average);
        
        System.out.println("-------------------------------------\n");
    }
    
    // Method to calculate average
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    
    // Method to find highest score
    public static double findHighest(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }
    
    // Method to find lowest score
    public static double findLowest(double[] scores) {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
    
    // Method to display scores above average
    public static void displayAboveAverage(double[] scores, double average) {
        System.out.println("\n-------------------------------------------");
        System.out.println("Scores Above Average:");
        System.out.println("-------------------------------------------");
        
        boolean found = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.printf("Student %d: %.2f\n", (i + 1), scores[i]);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No scores above average.");
        }
    }
}