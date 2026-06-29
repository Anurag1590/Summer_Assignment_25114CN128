// Code to create a menu driven array operation system.
import java.util.*;
class Question_114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int choice, i, sum = 0;

        System.out.println("Menu");
        System.out.println("1. Input Array");
        System.out.println("2. Display Array");
        System.out.println("3. Find Sum");
        System.out.println("4. Find Maximum");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter 5 elements:");
                for (i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Array Stored Successfully.");
                break;

            case 2:
                System.out.println("Enter 5 elements:");
                for (i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.println("Array Elements:");
                for (i = 0; i < 5; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 3:
                System.out.println("Enter 5 elements:");
                for (i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }

                for (i = 0; i < 5; i++) {
                    sum += arr[i];
                }

                System.out.println("Sum = " + sum);
                break;

            case 4:
                System.out.println("Enter 5 elements:");
                for (i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }

                int max = arr[0];
                for (i = 1; i < 5; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println("Maximum = " + max);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}