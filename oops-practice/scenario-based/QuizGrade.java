public class QuizGrade {

    // Constant for pass percentage
    private static final double PASS_PERCENTAGE = 40.0;

    public static void main(String[] args) {

        String[] correctAnswers = {
                "A", "C", "B", "D", "A",
                "B", "C", "D", "A", "B"
        };

        String[] studentAnswers = {
                "A", "c", "B", "A", "A",
                "b", "C", "D", "C", "B"
        };

        int score = calculateScore(correctAnswers, studentAnswers);
        double percentage = calculatePercentage(score, correctAnswers.length);

        displayResult(score, correctAnswers.length, percentage);
    }

    // Calculates score by comparing answers
    private static int calculateScore(String[] correctAnswers, String[] studentAnswers) {

        if (correctAnswers.length != studentAnswers.length) {
            throw new IllegalArgumentException("Answer sheets length mismatch.");
        }

        int score = 0;
        System.out.println("Quiz Feedback:\n");

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
                score++;
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }

        return score;
    }

    // Calculates percentage
    private static double calculatePercentage(int score, int totalQuestions) {
        return (score * 100.0) / totalQuestions;
    }

    // Displays final result
    private static void displayResult(int score, int totalQuestions, double percentage) {

        System.out.println("\nTotal Score: " + score + " / " + totalQuestions);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= PASS_PERCENTAGE) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
