import java.util.Scanner; // Import the Scanner class to read user input
import java.text.DecimalFormat; // Import the DecimalFormat class for formatting

public class EmployeeBonusEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the employee's salary
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble(); // Use double for more precision

        // Prompt the user to enter the employee's years of service
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();

        double bonusAmount = 0.0;
        final double BONUS_RATE = 0.05; // 5% bonus rate

        // Check if the years of service are more than 5
        if (yearsOfService > 5) {
            bonusAmount = salary * BONUS_RATE;
        }

        // Use DecimalFormat to format the output for currency
        DecimalFormat df = new DecimalFormat("#.##");

        // Print the bonus amount
        System.out.println("Bonus amount: " + df.format(bonusAmount));

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
