import java.util.Scanner;

public class GradeUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Marks
        System.out.print("Enter marks (0–100): ");
        int marks = scanner.nextInt();

        // Validate input
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            // Convert marks to grade group
            int gradeGroup = marks / 5;

            // Switch-case based on grade group
            switch (gradeGroup) {
                case 0: case 1: case 2: case 3: case 4:
                    System.out.println("Grade: F");
                    break;
                case 5: case 6: case 7: case 8:
                    System.out.println("Grade: E");
                    break;
                case 9: case 10:
                    System.out.println("Grade: D");
                    break;
                case 11: case 12: case 13:
                    System.out.println("Grade: C");
                    break;
                case 14: case 15: case 16:
                    System.out.println("Grade: B");
                    break;
                case 17: case 18: case 19: case 20:
                    System.out.println("Grade: A");
                    break;
            }
        }

        scanner.close();
    }
}
