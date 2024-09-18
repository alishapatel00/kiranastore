import java.util.ArrayList;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String type, double amount) {
        if (!type.equals("credit") && !type.equals("debit")) {
            System.out.println("Invalid transaction type. Use 'credit' or 'debit'.");
            return;
        }
        transactions.add(new Transaction(type, amount));
        System.out.println("Transaction added: " + type + " of $" + amount);
    }

    public void displayTransactions() {
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public double calculateBalance() {
        double balance = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getType().equals("credit")) {
                balance += transaction.getAmount();
            } else {
                balance -= transaction.getAmount();
            }
        }
        return balance;
    }
}
