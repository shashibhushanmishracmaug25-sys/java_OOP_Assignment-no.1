import java.util.Scanner;

public class LeapYearTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Year
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Leap year logic using nested ternary operator
        String result = (year % 4 == 0) ? 
                        ((year % 100 == 0) ? 
                            ((year % 400 == 0) ? "Leap Year" : "Not a Leap Year") 
                            : "Leap Year") 
                        : "Not a Leap Year";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
