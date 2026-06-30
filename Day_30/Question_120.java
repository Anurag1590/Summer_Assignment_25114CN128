// Code to  Develop complete mini project using arrays, strings and functions. 
import java.util.*;
public class Question_120 {
    static void addStudents(String[] name, int[] roll, int[] marks, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("Enter Roll Number: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
    }
    static void displayStudents(String[] name, int[] roll, int[] marks, int n) {
        System.out.println("\n----- Student Records -----");
        System.out.printf("%-10s %-20s %-10s\n", "Roll No", "Name", "Marks");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-10d\n", roll[i], name[i], marks[i]);
        }
    }
    static void searchStudent(String[] name, int[] roll, int[] marks, int n, int searchRoll) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (roll[i] == searchRoll) {
                System.out.println("\nStudent Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] roll = new int[n];
        int[] marks = new int[n];
        addStudents(name, roll, marks, n, sc);
        displayStudents(name, roll, marks, n);
        System.out.print("\nEnter Roll Number to search: ");
        int searchRoll = sc.nextInt();
        searchStudent(name, roll, marks, n, searchRoll);
    }
}
