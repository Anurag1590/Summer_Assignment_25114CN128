// Code to  Create mini library system. 
import java.util.*;
public class Question_118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] bookName = new String[n];
        String[] author = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1));
            System.out.print("Enter Book Name: ");
            bookName[i] = sc.nextLine();
            System.out.print("Enter Author Name: ");
            author[i] = sc.nextLine();
        }
        System.out.println("\n----- Library Records -----");
        System.out.printf("%-25s %-20s\n", "Book Name", "Author");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s\n", bookName[i], author[i]);
        }
    }
}