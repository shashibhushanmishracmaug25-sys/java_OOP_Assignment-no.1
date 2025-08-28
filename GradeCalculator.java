import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Percentage marks
        System.out.print("Enter percentage marks: ");
        int percentage = scanner.nextInt();

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 76) {
            grade = "A";
        } else if (percentage >= 66) {
            grade = "B+";
        } else if (percentage >= 51) {
            grade = "B";
        } else if (percentage >= 36) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        // Output: Grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
