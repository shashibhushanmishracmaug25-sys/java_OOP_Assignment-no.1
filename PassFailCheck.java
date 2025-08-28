import java.util.Scanner;

public class PassFailCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Marks
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        // Check pass/fail using ternary operator
        String result = (marks >= 35) ? "Pass" : "Fail";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
