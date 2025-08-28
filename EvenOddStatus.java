import java.util.Scanner;

public class EvenOddStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Input: Second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Determine even/odd status
        String result = (num1 % 2 == 0 && num2 % 2 == 0) ? "Both numbers are even" :
                        (num1 % 2 != 0 && num2 % 2 != 0) ? "Both numbers are odd" :
                        "Numbers are mixed (one even, one odd)";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}

