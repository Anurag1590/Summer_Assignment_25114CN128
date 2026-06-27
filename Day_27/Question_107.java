// code to create a salary management system.
import java.util.*;
public class Question_107 {

    static class Employee {
        int id;
        String name;
        double basicSalary;
        double hra;
        double da;
        double totalSalary;

        public Employee(int id, String name, double basicSalary) {
            this.id = id;
            this.name = name;
            this.basicSalary = basicSalary;
            this.hra = 0.2 * basicSalary;
            this.da = 0.1 * basicSalary;
            this.totalSalary = basicSalary + hra + da;
        }

        public void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", Basic: " + basicSalary + ", HRA: " + hra + ", DA: " + da + ", Total: " + totalSalary);
        }
    }

    static ArrayList<Employee> employees = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, salary));
        System.out.println("Employee added successfully!\n");
    }

    public static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.\n");
            return;
        }

        for (Employee e : employees) {
            e.display();
        }
        System.out.println();
    }

    public static void searchEmployee() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Employee e : employees) {
            if (e.id == id) {
                System.out.println("Employee found:");
                e.display();
                return;
            }
        }

        System.out.println("Employee not found.\n");
    }

    public static void removeEmployee() {
        System.out.print("Enter ID to remove: ");
        int id = sc.nextInt();

        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.id == id) {
                it.remove();
                System.out.println("Employee removed successfully!\n");
                return;
            }
        }

        System.out.println("Employee not found.\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("===== Salary Management System =====");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. View Salaries");
            System.out.println("3. Search Employee Salary");
            System.out.println("4. Remove Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> searchEmployee();
                case 4 -> removeEmployee();
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

