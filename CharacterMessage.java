import java.util.Scanner;

public class CharacterMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Character
        System.out.print("Enter a character (A–E): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        // Switch-case to print message
        switch (choice) {
            case 'A':
                System.out.println("You selected option A.");
                break;
            case 'B':
                System.out.println("You selected option B.");
                break;
            case 'C':
                System.out.println("You selected option C.");
                break;
            case 'D':
                System.out.println("You selected option D.");
                break;
            case 'E':
                System.out.println("You selected option E.");
                break;
            default:
                System.out.println("Invalid input. Please enter a character between A and E.");
        }

        scanner.close();
    }
}
