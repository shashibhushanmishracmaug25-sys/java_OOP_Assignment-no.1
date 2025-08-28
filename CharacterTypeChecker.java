import java.util.Scanner;

public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Character
        System.out.print("Enter character: ");
        char ch = scanner.next().charAt(0);

        // Check character type
        String result = (Character.isLetter(ch)) ? "Alphabet" :
                        (Character.isDigit(ch)) ? "Digit" :
                        "Special Character";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
