import java.util.Scanner; 

public class HighestSalaryOffer {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); 

        System.out.print("Enter salary for Company 1: ");
        int salary1 = inputScanner.nextInt(); 

        System.out.print("Enter salary for Company 2: ");
        int salary2 = inputScanner.nextInt(); 

        System.out.print("Enter salary for Company 3: ");
        int salary3 = inputScanner.nextInt(); 

        if (salary1 >= salary2 && salary1 >= salary3) { 
            System.out.println("Company 1 offers the highest salary"); 
        } else if (salary2 >= salary1 && salary2 >= salary3) { 
            System.out.println("Company 2 offers the highest salary");
        } else { 
            System.out.println("Company 3 offers the highest salary");
        }
    }
}
