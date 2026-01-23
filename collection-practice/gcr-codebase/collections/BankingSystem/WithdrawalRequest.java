package BankingSystem;

public class WithdrawalRequest {
	int accountNumber;
    double amount;

    WithdrawalRequest(int accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}
