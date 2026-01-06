class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

public class ScoreAnalyzer {

    public static void main(String[] args) {

        double[] scores = {85, 65, 78, 35, 64, 95, 25};

        try {
            validateScores(scores);

            System.out.printf("Average Score: %.2f%n", calculateAverage(scores));
            System.out.println("Highest Score: " + findMax(scores));
            System.out.println("Lowest Score: " + findMin(scores));

        } catch (InvalidScoreException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Validates score range
    private static void validateScores(double[] scores) throws InvalidScoreException {
        for (double score : scores) {
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("Invalid score found: " + score);
            }
        }
    }

    // Calculates average score
    private static double calculateAverage(double[] scores) {
        if (scores.length == 0) {
            return 0;
        }

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // Finds highest score
    private static double findMax(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    // Finds lowest score
    private static double findMin(double[] scores) {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }
}
