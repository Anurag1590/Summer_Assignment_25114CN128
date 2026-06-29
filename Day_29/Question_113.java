// Code to create a menu driven calculator.
import java.util.*;

class Question_113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        double a, b;

        System.out.println("Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not possible.");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}