package BankingSystem;

public class BankingApp {

	public static void main(String[] args) {
		BankingOperations bank = new BankingOperations();

        bank.addAccount(101, 50000);
        bank.addAccount(102, 30000);
        bank.addAccount(103, 70000);

        bank.requestWithdrawal(101, 10000);
        bank.requestWithdrawal(102, 40000);
        bank.requestWithdrawal(103, 20000);

        bank.displayAccounts();
        bank.processWithdrawals();
        bank.displaySortedByBalance();

	}

}
