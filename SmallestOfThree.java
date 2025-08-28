import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Three numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Find smallest using nested ternary operator
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

        // Output: Smallest number
        System.out.println("Smallest number: " + smallest);

        scanner.close();
    }
}
