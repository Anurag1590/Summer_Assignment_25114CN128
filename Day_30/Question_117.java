
// Code to create  student record system using arrays and strings. 
import java.util.*;
public class Question_117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] name = new String[n];
        int[] rollNo = new int[n];
        String[] course = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("Enter Roll Number: ");
            rollNo[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter Course: ");
            course[i] = sc.nextLine();
        }
        System.out.println("\n----- Student Records -----");
        System.out.printf("%-10s %-20s %-15s\n", "Roll No", "Name", "Course");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-20s %-15s\n", rollNo[i], name[i], course[i]);
        }
    }
}