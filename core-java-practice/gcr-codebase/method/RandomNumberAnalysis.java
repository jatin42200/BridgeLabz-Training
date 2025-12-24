import java.util.Arrays;

public class RandomNumberAnalysis {

    // here we generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generates random number between 1000 and 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    // return array -> [average, min, max]
    public double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum = sum + num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args) {

        RandomNumberAnalysis obj = new RandomNumberAnalysis();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = obj.generate4DigitRandomArray(5);

        // Find average, min, max
        double[] result = obj.findAverageMinMax(randomNumbers);

        // Display output
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Average Value: " + result[0]);
        System.out.println("Minimum Value: " + (int) result[1]);
        System.out.println("Maximum Value: " + (int) result[2]);
    }
}

