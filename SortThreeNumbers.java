import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Three numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        int first, second, third;

        // Sorting logic using if-else
        if (a <= b && a <= c) {
            first = a;
            if (b <= c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b <= a && b <= c) {
            first = b;
            if (a <= c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (a <= b) {
                second = a;
                third = b;
            } else {
                second = b;
                third = a;
            }
        }

        // Output: Sorted numbers
        System.out.println("Ascending order: " + first + ", " + second + ", " + third);

        scanner.close();
    }
}
