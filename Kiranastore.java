import java.util.Scanner;

public class Kiranastore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionManager transactionManager = new TransactionManager();
        
        while (true) {
            System.out.println("Enter transaction type (credit/debit) or 'exit' to quit:");
            String type = scanner.nextLine();
            
            
            if (type.equalsIgnoreCase("exit")) {
                break;
            }
            
            System.out.println("Enter transaction amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            
            transactionManager.addTransaction(type.toLowerCase(), amount);
            transactionManager.displayTransactions();
            System.out.println("Current Balance: $" + transactionManager.calculateBalance());
        }

        scanner.close();
    }
}
