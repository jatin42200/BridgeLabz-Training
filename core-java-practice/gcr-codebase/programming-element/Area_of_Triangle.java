import java.util.Scanner;
public class Area_of_Triangle {
    public static void main(String[] args) {
        // here we take input of base and height
        Scanner sc=new Scanner(System.in);        
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        // area in square centimeters
        double AreaCM=0.5 * base * height;

        // convert sq cm into sq inches (1 inch = 2.54 cm)
        double AreaInch = AreaCM/(2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " +AreaInch+" and sq cm is "+AreaCM);
    }
}
