import java.util.Scanner;

public class Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();//here we input employee salary
        int years = sc.nextInt();//here we enter year of service of an employee

        double bonus = 0.0;//it is for calculating bonus

        if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("The bonus of employeee is "+bonus);
    }
}
