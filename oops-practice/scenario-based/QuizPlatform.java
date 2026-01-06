import java.util.*;

// Custom Exception for business logic errors
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}

class QuizProcessor {
    private String[] correctAnswers;
    private List<Integer> scores = new ArrayList<>();

    public QuizProcessor(String[] correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int calculateScore(String[] userAnswers) throws InvalidQuizSubmissionException {
        if (userAnswers.length != correctAnswers.length) {
            throw new InvalidQuizSubmissionException("Answer count mismatch!");
        }

        int score = 0;
        for (int i = 0; i < correctAnswers.length; i++) {
            // Validation: Ensure answer is not empty or null
            if (userAnswers[i] == null || userAnswers[i].trim().isEmpty()) {
                throw new InvalidQuizSubmissionException("Question " + (i + 1) + " was left blank!");
            }
            
            if (correctAnswers[i].equalsIgnoreCase(userAnswers[i].trim())) {
                score++;
            }
        }
        scores.add(score);
        return score;
    }

    public String getGrade(int totalscore) {
        double percentage = (totalscore * 100.0) / correctAnswers.length;
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        return "F";
    }

    public double getAverageScore() {
        if (scores.isEmpty()) return 0.0;
        int total = 0;
        for (int s : scores) total += s;
        return (double) total / scores.size();
    }

    public List<Integer> getScores() {
        return scores;
    }
}

public class QuizPlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        QuizProcessor processor = new QuizProcessor(correctAnswers);

        System.out.print("Enter number of users taking the quiz: ");
        int userCount = sc.nextInt();
        sc.nextLine(); // Clear buffer

        for (int u = 1; u <= userCount; u++) {
            System.out.println("\n--- User " + u + " ---");
            String[] userAnswers = new String[correctAnswers.length];

            for (int i = 0; i < correctAnswers.length; i++) {
                System.out.print("Q" + (i + 1) + " (A/B/C/D): ");
                userAnswers[i] = sc.nextLine();
            }

            try {
                int score = processor.calculateScore(userAnswers);
                String grade = processor.getGrade(score);
                System.out.println("Result: " + score + "/" + correctAnswers.length + " | Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("Submission Failed: " + e.getMessage());
                u--; // Optional: Let the same user retry
            }
        }

        // Final Statistics
        System.out.println("\n========= FINAL REPORT =========");
        System.out.println("All Scores: " + processor.getScores());
        System.out.printf("Class Average: %.2f / %d%n", processor.getAverageScore(), correctAnswers.length);
        System.out.println("================================");
       
    }
}