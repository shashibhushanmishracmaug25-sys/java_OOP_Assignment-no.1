import java.util.Scanner;

public class MonthNameFromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Month number
        System.out.print("Enter month number (1–12): ");
        int month = scanner.nextInt();

        // Determine month name using nested ternary operators
        String monthName = (month == 1) ? "January" :
                           (month == 2) ? "February" :
                           (month == 3) ? "March" :
                           (month == 4) ? "April" :
                           (month == 5) ? "May" :
                           (month == 6) ? "June" :
                           (month == 7) ? "July" :
                           (month == 8) ? "August" :
                           (month == 9) ? "September" :
                           (month == 10) ? "October" :
                           (month == 11) ? "November" :
                           (month == 12) ? "December" :
                           "Invalid month number";

        // Output: Month name
        System.out.println("Month is " + monthName);

        scanner.close();
    }
}
