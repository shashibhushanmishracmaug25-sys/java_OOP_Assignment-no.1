import java.util.Scanner;

public class NumberSignCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Determine sign using nested ternary operator
        String result = (number > 0) ? "Number is Positive" :
                        (number < 0) ? "Number is Negative" :
                        "Number is Zero";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
