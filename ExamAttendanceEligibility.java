import java.util.Scanner;

public class ExamAttendanceEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Total classes held
        System.out.print("Enter total classes held: ");
        int totalClasses = scanner.nextInt();

        // Input: Classes attended
        System.out.print("Enter classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Calculate attendance percentage
        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        // Output: Eligibility check
        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }

        scanner.close();
    }
}
