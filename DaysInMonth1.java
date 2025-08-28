import java.util.Scanner;

public class DaysInMonth1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Year
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Input: Month number
        System.out.print("Enter month number (1–12): ");
        int month = scanner.nextInt();

        int days;

        // Determine days in month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month number.");
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    // Leap year check
                    days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
                    break;
                default:
                    days = 0; // Should never reach here
            }

            System.out.println(days + " days");
        }

        scanner.close();
    }
}
