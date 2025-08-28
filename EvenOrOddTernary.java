import java.util.Scanner;

public class EvenOrOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check even or odd using ternary operator
        String result = (number % 2 == 0) ? "Number is Even" : "Number is Odd";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
