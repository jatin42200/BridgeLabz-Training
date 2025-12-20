import java.util.*;

public class Greatest_Factor_Using_While{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int num = sc.nextInt();//Enter a number

        if (num <= 1) {
            System.out.println("No greatest factor exists for the given number");
        } else {
            int greatest_Factor = 1;
            int count = num - 1;

            while (count >= 1) {
                if (num % count == 0) {
                    greatest_Factor = count;
                    break;
                }
                count--;
            }
            System.out.println("The greatest factor of " + num + " beside itself is " + greatest_Factor);
        }
    }
}
