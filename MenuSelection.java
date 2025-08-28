import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Menu option number
        System.out.print("Enter a number (1–5): ");
        int option = scanner.nextInt();

        // Switch-case to print message
        switch (option) {
            case 1:
                System.out.println("You selected option 1.");
                break;
            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            default:
                System.out.println("Invalid selection. Please choose a number between 1 and 5.");
        }

        scanner.close();
    }
}
