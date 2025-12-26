
public class BonusOf10employee {

    // 1. Method to generate random employee data
    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2];
        
        for (int i = 0; i < count; i++) {
            // Generate a 5-digit salary: 10,000 to 99,999
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            
            // Generate years of service: 1 to 10 years (since company is 10 years old)
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;
        int[][] employeeData = generateEmployeeData(numberOfEmployees);
        
        double totalBonusCompanyHasToPay = 0;

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-12s | %-10s | %-8s | %-10s | %-10s\n", 
                          "Employee ID", "Old Salary", "Service", "Bonus Amt", "New Salary");
        System.out.println("-----------------------------------------------------------------------------");

        for (int i = 0; i < numberOfEmployees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage;

            // Rule: 5% if service > 5 years, else 2%
            if (years > 5) {
                bonusPercentage = 0.05; // 5%
            } else {
                bonusPercentage = 0.02; // 2%
            }

            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;
            totalBonusCompanyHasToPay += bonusAmount;

            // Display formatted results
            System.out.printf("Emp %-8d | %-10d | %-8d | %-10.2f | %-10.2f\n", 
                              (i + 1), salary, years, bonusAmount, newSalary);
        }

        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("Total Bonus Amount Zara has to pay: %.2f\n", totalBonusCompanyHasToPay);
    }
}