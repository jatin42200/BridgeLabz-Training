import java.util.Scanner;

public class Zara_Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define arrays for 10 employees to save salary and years of service
        double[][] employeeData = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        
        // Variables declearation here
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        
        // here we take input employee data
        for (int i = 0; i < 10; i++) {
            
            double salary = sc.nextDouble(); // Input salary with validation
            
            if (salary <= 0) {
                System.out.println("salary can't be zero or negative please enter again");
                i--; // Decrement to repeat this iteration
                continue;
            }
            
            // Input years of service with validation
            double years = sc.nextDouble();
            
            if (years < 0) {
                i--; // Decrement to repeat this iteration
                continue;
            }
            
            // here we Store valid data
            employeeData[i][0] = salary;
            employeeData[i][1] = years;
            System.out.println();
        }
        
        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            
            // Calculate bonus based on years of service
            if (years > 5) {
                bonus[i] = salary * 0.05; // 5% bonus
            } else {
                bonus[i] = salary * 0.02; // 2% bonus
            }
            
            // here we calculate new salary
            newSalary[i] = salary + bonus[i];
            
            // Add to totals
            totalOldSalary += salary;
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        
        // Display results        
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.printf("  Old Salary: $%.2f\n", employeeData[i][0]);
            System.out.printf("  Years of Service: %.1f years\n", employeeData[i][1]);
            System.out.printf("  Bonus: $%.2f ", bonus[i]);
            System.out.println(employeeData[i][1] > 5 ? "(5%)" : "(2%)");
            System.out.printf("  New Salary: $%.2f\n\n", newSalary[i]);
        }
        
        // Display totals
        System.out.printf("Total Old Salary: $%.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout: $%.2f\n", totalBonus);
        System.out.printf("Total New Salary: $%.2f\n", totalNewSalary);
    }
}