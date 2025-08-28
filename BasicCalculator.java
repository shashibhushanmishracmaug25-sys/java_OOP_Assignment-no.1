import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input: Second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input: Operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Nested if-else to perform calculation
        if (operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else {
            if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else {
                if (operator == '*') {
                    System.out.println("Result: " + (num1 * num2));
                } else {
                    if (operator == '/') {
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                    } else {
                        System.out.println("Error: Invalid operator.");
                    }
                }
            }
        }

        scanner.close();
    }
}
