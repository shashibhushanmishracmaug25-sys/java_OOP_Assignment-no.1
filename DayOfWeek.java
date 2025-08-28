import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Day number
        System.out.print("Enter day number (1–7): ");
        int dayNumber = scanner.nextInt();

        // Output: Day name
        if (dayNumber == 1) {
            System.out.println("Day is Monday");
        } else if (dayNumber == 2) {
            System.out.println("Day is Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Day is wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Day is Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Day is Friday");
        } else if (dayNumber == 6) {
            System.out.println("Day is Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Day is Sunday");
        } else {
            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}
