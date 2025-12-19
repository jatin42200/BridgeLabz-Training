import java.util.*;
public class SquareSide {
    public static void main(String[] args) {
        // here we take user input value of parameter
        Scanner sc = new Scanner(System.in);
        double perimeter = sc.nextDouble();

        double side;//side of square 

        side = perimeter/4; // here we calculate side

        System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);
    }
}