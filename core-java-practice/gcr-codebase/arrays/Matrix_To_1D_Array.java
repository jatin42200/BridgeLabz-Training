
import java.util.Scanner;

public class Matrix_To_1D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for rows and columns
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        
        // Create 2D array (Matrix)
        int[][] matrix = new int[rows][columns];
        
        // Take user input for matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // here we display 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // here we create 1D array
        int[] array = new int[rows * columns];
        
        // here we copy 2D array to 1D array
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[idx] = matrix[i][j];
                idx++;
            }
        }
        
        // here we Display 1D array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}