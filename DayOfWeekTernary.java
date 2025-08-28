import java.util.Scanner;

public class DayOfWeekTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Day number
        System.out.print("Enter day number (1–7): ");
        int day = scanner.nextInt();

        // Determine day using nested ternary operators
        String dayName = (day == 1) ? "Monday" :
                         (day == 2) ? "Tuesday" :
                         (day == 3) ? "Wednesday" :
                         (day == 4) ? "Thursday" :
                         (day == 5) ? "Friday" :
                         (day == 6) ? "Saturday" :
                         (day == 7) ? "Sunday" :
                         "Invalid day number";

        // Output: Day name
        System.out.println("Day is " + dayName);

        scanner.close();
    }
}
