import java.util.Scanner;

public class SeasonByMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Month number
        System.out.print("Enter month number (1–12): ");
        int month = scanner.nextInt();

        // Determine season
        String season;
        if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else if (month >= 3 && month <= 5) {
            season = "Summer";
        } else if (month >= 6 && month <= 8) {
            season = "Monsoon";
        } else if (month >= 9 && month <= 11) {
            season = "Autumn";
        } else {
            season = "Invalid month number";
        }

        // Output: Season
        System.out.println("Season is " + season);

        scanner.close();
    }
}

