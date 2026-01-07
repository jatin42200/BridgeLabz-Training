

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Abstraction
interface BankService {
    void transfer(Account to, double amount) throws InsufficientBalanceException;
}

// Base Class (OOP: Inheritance)
abstract class Account {
    String accNumber;
    double balance;

    Account(String accNumber, double balance) {
        this.accNumber = accNumber;
        this.balance = balance;
    }

    // Synchronized to handle Multithreading
    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) throw new InsufficientBalanceException("Low balance in " + accNumber);
        balance -= amount;
    }
    
    abstract void calculateInterest();
}

// Polymorphism: Different Interest Calculations
class SavingsAccount extends Account {
    SavingsAccount(String accNo, double bal) { super(accNo, bal); }
    void calculateInterest() { System.out.println("Interest: " + (balance * 0.04)); }
}

class CurrentAccount extends Account implements BankService {
    CurrentAccount(String accNo, double bal) { super(accNo, bal); }
    void calculateInterest() { System.out.println("No interest for Current Account."); }

    @Override
    public void transfer(Account to, double amount) throws InsufficientBalanceException {
        this.withdraw(amount);
        to.deposit(amount);
        System.out.println("Transfer Success! New Balance: ₹" + this.balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        CurrentAccount myAcc = new CurrentAccount("ACT123", 5000);
        SavingsAccount friendAcc = new SavingsAccount("ACT456", 1000);

        // Multithreading simulation using a Thread
        Thread t1 = new Thread(() -> {
            try {
                myAcc.transfer(friendAcc, 2000);
            } catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
    }
}
