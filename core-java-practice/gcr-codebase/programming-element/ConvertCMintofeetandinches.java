import java.util.Scanner;
public class HeightConvertFrom_CM_to_feet_and_inches
 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double heightCm=input.nextDouble();//initialize heightCm by taking input hight in cm
        //here we declear some element
        double totalInche;//it is for total inch
        int feet;//it is for final feet
        double inches;//it is for final inch
        // convert cm to inches
        totalInche=heightCm/2.54;//here we find total inch from total centi meters
        feet=(int)(totalInche/12);//here we extract total feet 
        inches=totalInche%12;//here we find remaining inches
        //here we printy the output
        System.out.println("Your Height in cm is "+heightCm+" while in feet is "+feet+" and inches is "+inches);
    }
}