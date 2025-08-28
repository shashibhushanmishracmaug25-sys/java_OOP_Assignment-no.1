import java.util.Scanner;

public class BonusEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Salary
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        // Input: Years of service
        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        // Calculate bonus using ternary operator
        double bonus = (years > 5) ? (salary * 0.05) : 0;

        // Output: Bonus
        System.out.println("Bonus: " + bonus);

        scanner.close();
    }
}
