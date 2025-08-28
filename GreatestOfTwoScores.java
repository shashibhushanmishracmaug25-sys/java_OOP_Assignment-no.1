import java.util.Scanner; 

public class GreatestOfTwoScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score for Test 1: ");
        int test1Score = scanner.nextInt();
        System.out.print("Enter score for Test 2: ");
        int test2Score = scanner.nextInt();
        scanner.close();
        if (test1Score > test2Score) {
            System.out.println("Test 1 has higher score.");
        } else if (test2Score > test1Score) {
            System.out.println("Test 2 has higher score.");
        } else {
            System.out.println("Both tests have the same score.");
        }
    }
}
