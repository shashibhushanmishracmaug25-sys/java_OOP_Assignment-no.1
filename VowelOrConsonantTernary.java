import java.util.Scanner;

public class VowelOrConsonantTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Character
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        // Check if input is a valid letter
        String result = (Character.isLetter(ch)) ?
                        ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ?
                            "Vowel" : "Consonant") :
                        "Invalid input";

        // Output: Result
        System.out.println(result);

        scanner.close();
    }
}
