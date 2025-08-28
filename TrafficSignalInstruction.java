import java.util.Scanner;

public class TrafficSignalInstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Traffic light color
        System.out.print("Enter traffic light color (Red, Green, Yellow): ");
        String color = scanner.next().toLowerCase();

        // Switch-case to determine instruction
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Wait");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color. Please enter Red, Green, or Yellow.");
        }

        scanner.close();
    }
}
