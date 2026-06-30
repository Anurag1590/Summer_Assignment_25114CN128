// Code to Create mini employee management system. 
import java.util.*;
public class Question_119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] empId = new int[n];
        String[] empName = new String[n];
        String[] department = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));
            System.out.print("Enter Employee ID: ");
            empId[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            empName[i] = sc.nextLine();
            System.out.print("Enter Department: ");
            department[i] = sc.nextLine();
        }
        System.out.println("\n----- Employee Records -----");
        System.out.printf("%-15s %-20s %-20s\n", "Employee ID", "Name", "Department");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15d %-20s %-20s\n", empId[i], empName[i], department[i]);
        }
    }
}