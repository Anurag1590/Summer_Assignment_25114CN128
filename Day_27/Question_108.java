// Code to create marksheet generation system.
import java.util.*;
public class Question_108 {

    static class Student {
        int id;
        String name;
        int m1, m2, m3;
        int total;
        double percentage;
        String grade;

        public Student(int id, String name, int m1, int m2, int m3) {
            this.id = id;
            this.name = name;
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
            this.total = m1 + m2 + m3;
            this.percentage = total / 3.0;

            if (percentage >= 80) grade = "A";
            else if (percentage >= 60) grade = "B";
            else if (percentage >= 40) grade = "C";
            else grade = "F";
        }

        public void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", M1: " + m1 + ", M2: " + m2 + ", M3: " + m3 + ", Total: " + total + ", %: " + percentage + ", Grade: " + grade);
        }
    }

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        students.add(new Student(id, name, m1, m2, m3));
        System.out.println("Marksheet generated successfully!\n");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.\n");
            return;
        }

        for (Student s : students) {
            s.display();
        }
        System.out.println();
    }

    public static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Record found:");
                s.display();
                return;
            }
        }

        System.out.println("Record not found.\n");
    }

    public static void removeStudent() {
        System.out.print("Enter ID to remove: ");
        int id = sc.nextInt();

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.id == id) {
                it.remove();
                System.out.println("Record removed successfully!\n");
                return;
            }
        }

        System.out.println("Record not found.\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("===== Marksheet Generation System =====");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View Marksheet");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> removeStudent();
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

