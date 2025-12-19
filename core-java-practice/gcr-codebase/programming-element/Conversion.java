import java.util.Scanner;
public class Conversion {
    public static void main(String[] args)
     {
        double km;
        double miles;
        Scanner input = new Scanner(System.in);
        km=input.nextDouble();//taking input of km in integer
        miles=km/1.6;//1 mile=1.6 km
        System.out.println("The total miles is "+miles+" mile for the given "+km+" km");//print output
    }
}
