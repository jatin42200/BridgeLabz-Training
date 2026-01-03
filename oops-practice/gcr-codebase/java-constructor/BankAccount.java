class BankAccount {

    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccountTypes {

    public void displayDetails() {
        System.out.println(accountNumber);
        System.out.println(accountHolder);
    }
}

