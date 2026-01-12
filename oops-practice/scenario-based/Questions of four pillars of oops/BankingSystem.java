public class BankingSystem
{
	public static void main(String[] args) {
		try {
		    System.out.println("_________Welcome to the online Bank__________");
		    //saving account Test
		    System.out.println("\n____________Saving Account Test_____");
		    SavingAccount SA=new SavingAccount("goldy",1369420,10000.00);
		    SA.checkBalance();
		    SA.deposit(430.00);
		    SA.calcluateInterest();
		    SA.withdrawl(300.00);
		    System.out.println("\n____________Current Account Test_____");
		    CurrentAccount CA=new CurrentAccount("jatin",4206969,50000.00);
		    CA.checkBalance();
		    CA.deposit(430.00);
		    CA.calcluateInterest();
		    CA.withdrawl(300.00);
		    System.out.println("\n____ Triggering Exception ____");
            SA.withdrawl(11000.00); // Yeh error throw karega
		    
		    
		    
		} 
		catch (InsufficientBalanceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
	}
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class Account
{
    protected String AccountHolderName;
    protected int AccountNo;
    protected double balance;
    public Account(String AccountHolderName,int AccountNo,double balance)
    {
        this.AccountHolderName=AccountHolderName;
        this.AccountNo=AccountNo;
        this.balance=balance;
    }
    public void checkBalance()
    {
        System.out.println("Balance of the ccount is : "+balance);
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("New Balance after deposit amount "+amount+" is : "+balance);
    }
    public void withdrawl(double amount)throws InsufficientBalanceException
    {
        if(amount>balance)
        {
            throw new InsufficientBalanceException("Error: Balance kam hai bhai!");
        }
        else{
        balance=balance-amount;
        System.out.println("New Balance after withdrawl amount "+amount+" is : "+balance);    
        }
    }
    public void calcluateInterest()
    {
       System.out.println("no interest for basic account");
    }
}
class SavingAccount extends Account
{
    private double interestRate = 0.04;
    public SavingAccount(String AccountHolderName,int AccountNo,double balance)
    {
        super(AccountHolderName,AccountNo,balance);
        
    }
    public void calcluateInterest()
    {
        double interest=interestRate*balance;
        balance=balance+interest;
        System.out.println("Balance after interrest is : "+balance);
    }
}
class CurrentAccount extends Account
{
    private double overdraftlimit=50000.00;
    public CurrentAccount(String AccountHolderName,int AccountNo,double balance)
    {
        super(AccountHolderName,AccountNo,balance);
        
    }
    public void withdrawl(double amount)throws InsufficientBalanceException{
        if(amount>balance+overdraftlimit)
        {
            throw new InsufficientBalanceException("Error: Overdraft limit exceeded!");
        }
        else{
            balance=balance-amount;
            System.out.println("new balance after withdrawling this amount " + amount + " is : " + balance);
        }
    }
    public void calcluateInterest()
    {
        System.out.println("no interest for Current account");
    }
}
