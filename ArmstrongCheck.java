import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 100 || number > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int original = number;
            int sum = 0;

            // Extract digits and compute cube sum
            while (number != 0) {
                int digit = number % 10;
                sum += digit * digit * digit;
                number /= 10;
            }

            // Output result
            if (sum == original) {
                System.out.println(original + " is an Armstrong number");
            } else {
                System.out.println(original + " is not an Armstrong number");
            }
        }

        scanner.close();
    }
}
