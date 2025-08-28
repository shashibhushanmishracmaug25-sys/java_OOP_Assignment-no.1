import java.util.Scanner;
public class ExamPassOrFail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            if (marks >= 35) {
                System.out.println("Student has passed.");
            } else {
                System.out.println("Student has failed.");
            }
        }
    }
}

