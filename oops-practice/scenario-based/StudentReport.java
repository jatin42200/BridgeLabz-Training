

// Custom Exception for Mark Validation
class InvalidMarkException extends Exception {
    InvalidMarkException(String msg) {
        super(msg);
    }
}

public class StudentReport {

    public static void main(String[] args) {
        String subjects[] = {"Physics", "Chemistry", "Maths"};
        
        // Student Data
        String[] names = {"Amit", "Neha", "Rahul"};
        int[][] allMarks = {
            {85, 90, 78},   // Amit (Valid)
            {95, 88, 92},   // Neha (Valid)
            {120, 70, 60}   // Rahul (Invalid - 120 marks)
        };

        System.out.println("=== STUDENT REPORT MANAGEMENT SYSTEM ===\n");

        for (int i = 0; i < names.length; i++) {
            try {
                // Pehle marks check karenge
                validateMarks(allMarks[i]);
                
                // Agar valid hain, to report print hogi
                displayReport(names[i], subjects, allMarks[i]);
                
            } catch (InvalidMarkException e) {
                // Agar invalid marks hain, to error message dikhayenge 
                // aur next student par move karenge
                System.out.println(">>> Error for " + names[i] + ": " + e.getMessage());
                System.out.println("----------------------------------------\n");
            }
        }
    }

    // Marks validate karne ka logic
    public static void validateMarks(int marks[]) throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Marks " + mark + " are invalid! Must be between 0 and 100.");
            }
        }
    }

    // Average calculate karne ka logic (Double use kiya hai accurate calculation ke liye)
    public static double averageScore(int scores[]) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Grade find karne ka logic
    public static char findGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else return 'D';
    }

    // Report Card display karne ka logic
    static void displayReport(String name, String[] subjects, int[] marks) {
        double avg = averageScore(marks);
        char grade = findGrade(avg);

        System.out.println("--------- REPORT CARD ---------");
        System.out.println("Name    : " + name);
        System.out.println("-------------------------------");
        
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%-10s : %d%n", subjects[i], marks[i]);
        }

        System.out.println("-------------------------------");
        System.out.printf("Average : %.2f%n", avg);
        System.out.println("Grade   : " + grade);
        System.out.println("-------------------------------\n");
    }
}