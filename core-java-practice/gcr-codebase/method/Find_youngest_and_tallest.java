
import java.util.Scanner;

public class Find_youngest_and_tallest {

    // in this section we find youngest friend
    public static int findYoungest(int[] ages) {
        int youngest_friend = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngest_friend]) {
                youngest_friend = i;
            }
        }
        return youngest_friend;
    }

    // in this section we find tallest friend
    public static int findTallest(double[] heights) {
        int tallest_friend = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest_friend]) {
                tallest_friend = i;
            }
        }
        return tallest_friend;
    }

    //here we create man imethod

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input
        for (int i = 0; i < 3; i++) {
            
            ages[i] = sc.nextInt();//here we take input for age
            heights[i] = sc.nextDouble();//here we take input for height
        }

        int youngest_friend = findYoungest(ages);
        int tallest_friend = findTallest(heights);

        System.out.println("\nYoungest Friend: " + names[youngest_friend] +" (Age: " + ages[youngest_friend] + ")");
        System.out.println("Tallest Friend: " + names[tallest_friend] +" (Height: " + heights[tallest_friend] + " cm)");
    }
}
