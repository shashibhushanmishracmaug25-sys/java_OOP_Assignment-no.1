import java.util.Scanner;

public class DivisibilityCheck2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // Check divisibility and print messages
        if (number % 2 == 0) {
            System.out.println("Divisible by 2");
        }
        if (number % 3 == 0) {
            System.out.println("Divisible by 3");
        }
        if (number % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        // If not divisible by any
        if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            System.out.println("Not divisible by 2, 3, or 5");
        }

        scanner.close();
    }
}
