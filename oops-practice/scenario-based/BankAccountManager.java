import java.util.*;

class Bank {
    static String bankName = "ICICI Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;
    private double balance;

    public Bank(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = (balance >= 0) ? balance : 0; // Ensure non-negative initial balance
        totalAccounts++;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter with validation
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    public static void displayTotalAccounts() {
        System.out.println("\n--- Global Statistics ---");
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount!!");
        }
    }

    public void withDraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient Balance!!");
        } else {
            System.out.println("Error: Invalid Withdrawal Amount!!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance for " + accountHolderName + ": " + balance);
    }

    public void displayAccountInfo() {
        System.out.println("\n------- Account Details -------");
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("-------------------------------\n");
    }
}

public class BankAccountManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to " + Bank.bankName + " ===");
        
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Create Object
        Bank user = new Bank(name, accNum, initialBalance);

        // Perform Operations
        user.displayAccountInfo();
        
        System.out.print("Enter amount to deposit: ");
        double depAmt = sc.nextDouble();
        user.deposit(depAmt);

        System.out.print("Enter amount to withdraw: ");
        double withAmt = sc.nextDouble();
        user.withDraw(withAmt);

        System.out.println("\nFinal Update:");
        user.checkBalance();
        
        // Show total accounts created
        Bank.displayTotalAccounts();
 // Good practice to close the scanner
    }
}