import java.util.Scanner;

public class Check_Number_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number");
        int num = sc.nextInt();
        //here we check number is negative,positive or zero
        if (num>0) 
            {
            System.out.println("positive");
            }
          else if (num<0)
             {
            System.out.println("negative");
             } 
        else 
            {
            System.out.println("zero");
           }
    }
}
