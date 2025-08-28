import java.util.Scanner;

public class ExamEligibilityWithMedical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Total classes held
        System.out.print("Enter total classes held: ");
        int totalClasses = scanner.nextInt();

        // Input: Classes attended
        System.out.print("Enter classes attended: ");
        int attendedClasses = scanner.nextInt();

        // Input: Medical cause (Y/N)
        System.out.print("Medical cause (Y/N): ");
        char medicalCause = scanner.next().toUpperCase().charAt(0);

        // Calculate attendance percentage
        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        // Determine eligibility
        if (attendancePercentage >= 75 || medicalCause == 'Y') {
            System.out.println("Student is allowed to sit for the exam.");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam.");
        }

        scanner.close();
    }
}
