import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Check eligibility using ternary operator
        String result = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
