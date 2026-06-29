// Code to create a menu driven string string operations system.
import java.util.*;
class Question_115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        int choice;

        System.out.println("Menu");
        System.out.println("1. Find Length");
        System.out.println("2. Convert to Uppercase");
        System.out.println("3. Convert to Lowercase");
        System.out.println("4. Reverse String");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Length = " + str.length());
                break;

            case 2:
                System.out.println("Uppercase = " + str.toUpperCase());
                break;

            case 3:
                System.out.println("Lowercase = " + str.toLowerCase());
                break;

            case 4:
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }
                System.out.println("Reversed String = " + rev);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}