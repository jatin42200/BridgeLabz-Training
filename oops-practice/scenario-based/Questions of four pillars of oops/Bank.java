
abstract class BankAccount {

    private final String accountNumber;
    private final double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    public abstract double calculateFee();
}

// SavingsAccount
class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        return getBalance() * 0.005;
    }
}

// CheckingAccount
class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateFee() {
        if (getBalance() < 1000) {
            return 1.0;
        }
        return 0.0;
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("12345", 1000.0);
        System.out.println(String.format("%.2f", savings.calculateFee())); // 5.00

        BankAccount s2 = new SavingsAccount("11111", 500.0);
        System.out.println( s2.calculateFee()); //output :- 2.50

        BankAccount c1 = new CheckingAccount("22222", 1500.0);
        System.out.println( c1.calculateFee()); //output :- 0.00

        BankAccount c2 = new CheckingAccount("33333", 500.0);
        System.out.println(c2.calculateFee()); //output :- 1.00
    }
}
