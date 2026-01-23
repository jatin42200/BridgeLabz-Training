package BankingSystem;

import java.util.*;

public class BankingOperations {
	HashMap<Integer, Double> accountMap = new HashMap<>();
    Queue<WithdrawalRequest> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(int accNo, double balance) {
        accountMap.put(accNo, balance);
    }

    // Add withdrawal request
    public void requestWithdrawal(int accNo, double amount) {
        withdrawalQueue.add(new WithdrawalRequest(accNo, amount));
    }

    // Process withdrawal requests
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest req = withdrawalQueue.poll();
            double balance = accountMap.get(req.accountNumber);

            if (balance >= req.amount) {
                accountMap.put(req.accountNumber, balance - req.amount);
                System.out.println("Withdrawal successful: " + req.accountNumber);
            } else {
                System.out.println("Insufficient balance: " + req.accountNumber);
            }
        }
    }

    // Display all accounts (HashMap)
    public void displayAccounts() {
        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    // Display accounts sorted by balance (TreeMap)
    public void displaySortedByBalance() {
        TreeMap<Double, Integer> sortedMap = new TreeMap<>();

        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<Double, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " -> ₹" + entry.getKey());
        }
    }
}
