// Code to create a contact management system.
import java.util.*;
public class Question_112 {
    static class Contact {
        int id;
        String name;
        String phone;
        String email;

        public Contact(int id, String name, String phone, String email) {
            this.id = id;
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", Phone: " + phone + ", Email: " + email);
        }
    }

    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addContact() {
        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(id, name, phone, email));
        System.out.println("Contact added successfully!\n");
    }

    public static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.\n");
            return;
        }

        for (Contact c : contacts) {
            c.display();
        }
        System.out.println();
    }

    public static void searchContact() {
        System.out.print("Enter Contact ID: ");
        int id = sc.nextInt();

        for (Contact c : contacts) {
            if (c.id == id) {
                System.out.println("Contact found:");
                c.display();
                return;
            }
        }

        System.out.println("Contact not found.\n");
    }

    public static void deleteContact() {
        System.out.print("Enter Contact ID to delete: ");
        int id = sc.nextInt();

        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.id == id) {
                it.remove();
                System.out.println("Contact deleted successfully!\n");
                return;
            }
        }

        System.out.println("Contact not found.\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!\n");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}