import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // Nested if-else to check divisibility
        if (number % 2 == 0) {
            System.out.println("Divisible by 2");

            if (number % 3 == 0) {
                System.out.println("Divisible by 3");

                if (number % 5 == 0) {
                    System.out.println("Divisible by 5");
                } else {
                    System.out.println("Not divisible by 5");
                }
            } else {
                System.out.println("Not divisible by 3");
                if (number % 5 == 0) {
                    System.out.println("Divisible by 5");
                } else {
                    System.out.println("Not divisible by 5");
                }
            }
        } else {
            System.out.println("Not divisible by 2");

            if (number % 3 == 0) {
                System.out.println("Divisible by 3");

                if (number % 5 == 0) {
                    System.out.println("Divisible by 5");
                } else {
                    System.out.println("Not divisible by 5");
                }
            } else {
                System.out.println("Not divisible by 3");

                if (number % 5 == 0) {
                    System.out.println("Divisible by 5");
                } else {
                    System.out.println("Not divisible by 5");
                }
            }
        }

        scanner.close();
    }
}

