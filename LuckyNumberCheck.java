import java.util.Scanner;

public class LuckyNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: 4-digit number
        System.out.print("Enter 4-digit number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 1000 || number > 9999) {
            System.out.println("Please enter a valid 4-digit number.");
        } else {
            // Extract digits
            int A = number / 1000;
            int B = (number / 100) % 10;
            int C = (number / 10) % 10;
            int D = number % 10;

            // Check if A + B == C + D
            if ((A + B) == (C + D)) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Not a lucky number");
            }
        }

        scanner.close();
    }
}
