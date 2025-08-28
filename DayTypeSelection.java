import java.util.Scanner;

public class DayTypeSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Day type
        System.out.print("Enter day type (1–Workday, 2–Weekend): ");
        int dayType = scanner.nextInt();

        // Output: Working status
        if (dayType == 1) {
            System.out.println("It’s a workday. Time to get things done!");
        } else if (dayType == 2) {
            System.out.println("It’s weekend. No work today.");
        } else {
            System.out.println("Invalid input. Please enter 1 for Workday or 2 for Weekend.");
        }

        scanner.close();
    }
}
