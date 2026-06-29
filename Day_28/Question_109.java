// Code to create library management system.
import java.util.*;

public class Question_109 {

    static class Book {
        int id;
        String title;
        String author;
        boolean issued;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.issued = false;
        }

        public void display() {
            System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + issued);
        }
    }

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!\n");
    }

    public static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.\n");
            return;
        }

        for (Book b : books) {
            b.display();
        }
        System.out.println();
    }

    public static void searchBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                System.out.println("Book found:");
                b.display();
                return;
            }
        }

        System.out.println("Book not found.\n");
    }

    public static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued successfully!\n");
                } else {
                    System.out.println("Book already issued.\n");
                }
                return;
            }
        }

        System.out.println("Book not found.\n");
    }

    public static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book returned successfully!\n");
                } else {
                    System.out.println("Book was not issued.\n");
                }
                return;
            }
        }

        System.out.println("Book not found.\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> searchBook();
                case 4 -> issueBook();
                case 5 -> returnBook();
                case 6 -> {
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