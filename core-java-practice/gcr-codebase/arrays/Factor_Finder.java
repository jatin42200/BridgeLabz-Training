
import java.util.Scanner;

public class Factor_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // here we take input
        int num = sc.nextInt();
        
        // here we Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;
        
        // here we find factors        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // Check if array is full
                if (idx == maxFactor) {
                    // Resize array - double the size
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    
                    // Copy elements to temp array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    
                    // Assign temp to factors
                    factors = temp;
                }
                
                //here we Store factor in factors array
                factors[idx] = i;
                idx++;
            }
        }
        
        // here we Display factors
        for (int i = 0; i < idx; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}