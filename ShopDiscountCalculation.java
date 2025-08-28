import java.util.Scanner; // Import the Scanner class to read user input
import java.text.DecimalFormat; // Import the DecimalFormat class for formatting the output

public class ShopDiscountCalculation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total purchase amount
        System.out.print("Enter total purchase amount: ");

        // Read the double input from the user for more accuracy
        double purchaseAmount = scanner.nextDouble();

        // Initialize final cost with the original purchase amount
        double finalCost = purchaseAmount;
        double discountRate = 0;

        // Check if the purchase amount exceeds 1000 to apply the discount
        if (purchaseAmount > 1000) {
            discountRate = 0.10; // 10% discount
            double discountAmount = purchaseAmount * discountRate;
            finalCost = purchaseAmount - discountAmount;
        }

        // Create a DecimalFormat object to format the output to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        // Print the final cost after the discount
        System.out.println("Final cost after discount: " + df.format(finalCost));

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
