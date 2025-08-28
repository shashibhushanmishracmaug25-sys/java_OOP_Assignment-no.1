import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Input: Second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Determine greatest using ternary operator
        int greatest = (num1 > num2) ? num1 : num2;

        // Output: Greatest number
        System.out.println("Greatest number: " + greatest);

        scanner.close();
    }
}
