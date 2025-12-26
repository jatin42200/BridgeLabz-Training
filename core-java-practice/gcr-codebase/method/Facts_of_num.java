import java.util.Scanner;

public class Facts_of_num {

    //Method to find factors and return them as an array
    public static int[] getFactorsArray(int num) {
        int count = 0;
        int temp = Math.abs(num);

        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                count++;
            }
        }

        // Second loop: Store factors in the array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    //Method to find the greatest factor (excluding the number itself)
    public static int getGreatestFactor(int[] factors) {
        if (factors.length <= 1) return factors[0];
        // Since factors are stored in ascending order, 
        // the second to last element is the greatest proper factor.
        return factors[factors.length - 2];
    }

    //Method to find the sum of factors
    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum = sum + f;
        }
        return sum;
    }

    //Method to find the product of factors
    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    //Method to find the product of the cube of the factors
    public static double getProductOfCubes(int[] factors) {
        double product = 1.0;
        for (int f : factors) {
            product = product * Math.pow(f, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();//here we take inputs

        // Generate the factors array
        int[] factors = getFactorsArray(input);

        // Display results
        System.out.println("\n--- Factor Analysis ---");
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Proper Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.printf("Product of Cubes: %.2f\n", getProductOfCubes(factors));

    }
}