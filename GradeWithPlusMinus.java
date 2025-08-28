import java.util.Scanner;

public class GradeWithPlusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Marks
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        // Determine grade with plus/minus
        String grade = (marks >= 85 && marks <= 100) ? "A" :
                       (marks >= 75 && marks < 85) ? "A−" :
                       (marks >= 65 && marks < 75) ? "B+" :
                       (marks >= 55 && marks < 65) ? "B−" :
                       (marks >= 45 && marks < 55) ? "C+" :
                       (marks >= 35 && marks < 45) ? "C−" :
                       (marks >= 0 && marks < 35) ? "F" :
                       "Invalid marks";

        // Output: Grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
