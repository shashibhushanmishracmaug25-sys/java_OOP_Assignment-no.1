import java.util.Scanner;

public class ReverseAndPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 4-digit number
        System.out.print("Enter 4-digit number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            int original = number;
            int reversed = 0;

            // Reverse the number
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            // Output: Reversed number
            System.out.println("Reversed number: " + reversed);

            // Check for palindrome
            String result = (original == reversed) ? "Palindrome: Yes" : "Palindrome: No";
            System.out.println(result);
        }

        scanner.close();
    }
}
