import java.util.Scanner;
      class Distance_in_yard
        {
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble(); // here we take input in feet

        // convert feet into yards
        double yard = distanceInFeet/3;

        // convert yard into miles
        double miles = yard/1760;

        System.out.println("The distance in yards is " +yard+" while the distance in miles is " +miles);
    }
}
