// Code to create a menu driven inventory.
import java.util.*;
class Question_116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String itemName;
        int quantity;
        double price;
        int choice;

        System.out.println("Inventory Management System");
        System.out.println("1. Add Item");
        System.out.println("2. Display Item");
        System.out.println("3. Calculate Total Value");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        price = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Item Added Successfully!");
                break;

            case 2:
                System.out.println("\nItem Details");
                System.out.println("Item Name : " + itemName);
                System.out.println("Quantity  : " + quantity);
                System.out.println("Price     : " + price);
                break;

            case 3:
                System.out.println("Total Value = " + (quantity * price));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}