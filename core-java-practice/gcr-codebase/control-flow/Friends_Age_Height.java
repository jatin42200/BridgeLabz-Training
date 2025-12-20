
import java.util.Scanner;

public class Friends_Age_Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amar_Age = sc.nextInt();//here we take input value 

        System.out.print("Enter Akbar's age: ");
        int akbar_Age = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthony_Age = sc.nextInt();

        // Input heights 
        int amar_Height = sc.nextInt();//Amar's height
        int akbar_Height = sc.nextInt();//Akbar's height
        int anthony_Height = sc.nextInt();//Anthony's height

        // here we find who is youngest
        if (amar_Age < akbar_Age && amar_Age < anthony_Age) {
            System.out.println("Amar is the youngest");
        } else if (akbar_Age < amar_Age && akbar_Age < anthony_Age) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // here we find who is tallest
        if (amar_Height > akbar_Height && amar_Height > anthony_Height) {
            System.out.println("Amar is the tallest");
        } else if (akbar_Height > amar_Height && akbar_Height > anthony_Height) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
