import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ages of three friends
        System.out.print("Enter age of Friend 1: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter age of Friend 2: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter age of Friend 3: ");
        int age3 = scanner.nextInt();

        // Determine oldest
        int oldestAge = Math.max(age1, Math.max(age2, age3));
        String oldestFriend = (oldestAge == age1) ? "Friend 1" :
                              (oldestAge == age2) ? "Friend 2" : "Friend 3";

        // Determine youngest
        int youngestAge = Math.min(age1, Math.min(age2, age3));
        String youngestFriend = (youngestAge == age1) ? "Friend 1" :
                                (youngestAge == age2) ? "Friend 2" : "Friend 3";

        // Output results
        System.out.println("Oldest: " + oldestFriend);
        System.out.println("Youngest: " + youngestFriend);

        scanner.close();
    }
}
