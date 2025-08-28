import java.util.Scanner;

public class ReverseFourDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 4-digit number
        System.out.print("Enter 4-digit number: ");
        int number = scanner.nextInt();

        // Check if it's a 4-digit number
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            int reversed = 0;
            int temp = number;

            // Reverse the number
            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            // Output: Reversed number
            System.out.println("Reversed number: " + reversed);
        }

        scanner.close();
    }
}

