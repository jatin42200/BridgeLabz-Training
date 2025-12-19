import java.util.Scanner;
public class Eligibility_for_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();//here we take input the age
        //here we check if person is greter than 18 than he can vote otherwise he can't vote 
        if (age >= 18) {
            System.out.println("The person's age is "+age+" and can vote.");
        } else {
            System.out.println("The person's age is "+age+" and cannot vote.");
        }
    }
}
