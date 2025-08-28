import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;

        // Calculate sum of digits
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Output: Sum of digits
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }
}
