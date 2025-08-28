import java.util.Scanner;

public class BankTransactionCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter transaction amount: ");
        double transactionAmount = scanner.nextDouble(); 

        if (transactionAmount > 0) {
            System.out.println("Deposit transaction.");
        } else if (transactionAmount < 0) { 
            System.out.println("Withdrawal transaction.");
        } else {
            System.out.println("No transaction.");
        }

        scanner.close(); 
    }
}
