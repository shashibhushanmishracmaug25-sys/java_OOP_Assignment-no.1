import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Purchase amount
        System.out.print("Enter purchase amount: ");
        double amount = scanner.nextDouble();

        // Calculate total cost using ternary operator
        double totalCost = (amount > 1000) ? (amount * 0.90) : amount;

        // Output: Total cost after discount
        System.out.println("Total cost after discount: " + totalCost);

        scanner.close();
    }
}
