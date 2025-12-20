
import java.util.Scanner;

public class Youngest_Tall_Friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //here we input Friend names
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        // here arrays to store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // here we take input for each friend
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();//here we take the input value of age
            System.out.print("Enter height (cm): ");
            heights[i] = sc.nextDouble();//here we take the input value of height
        }
        
        // Find youngest friend 
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Find tallest friend 
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Display all result 
        
                for (int i = 0; i < 3; i++) {
              System.out.println(friends[i] + " - Age: " + ages[i] + 
                " years, Height: " + heights[i] + " cm");
        }
        System.out.println("Youngest: " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + " years)");
        System.out.println("Tallest: " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm)");

    }
}
