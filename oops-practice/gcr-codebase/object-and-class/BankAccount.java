
class Bank {

    String accountHolder;
    String accountNumber;
    double balance;

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        displayBalance();
    }

   public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdraw amount is : " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
    class BankAccount{
        public static void main(String[] args) {

        Bank acc = new Bank();
        acc.accountHolder = "State of Chennai";
        acc.accountNumber = "ACC001";
        acc.balance = 700.0;

        System.out.println(acc.accountHolder);
        acc.displayBalance();

        acc.deposit(200.0);
        acc.withdraw(100.0);
        acc.withdraw(1000.0); // insufficient balance case
    }
}
    

