// Code to create a ticket booking system.
import java.util.*;
public class Question_111 {

    static class Ticket {
        int id;
        String name;
        String destination;
        int seats;

        public Ticket(int id, String name, String destination, int seats) {
            this.id = id;
            this.name = name;
            this.destination = destination;
            this.seats = seats;
        }

        public void display() {
            System.out.println("Ticket ID: " + id + ", Name: " + name + ", Destination: " + destination + ", Seats: " + seats);
        }
    }

    static ArrayList<Ticket> tickets = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void bookTicket() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        tickets.add(new Ticket(id, name, destination, seats));
        System.out.println("Ticket booked successfully!\n");
    }

    public static void viewTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked.\n");
            return;
        }

        for (Ticket t : tickets) {
            t.display();
        }
        System.out.println();
    }

    public static void searchTicket() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();

        for (Ticket t : tickets) {
            if (t.id == id) {
                System.out.println("Ticket found:");
                t.display();
                return;
            }
        }

        System.out.println("Ticket not found.\n");
    }

    public static void cancelTicket() {
        System.out.print("Enter Ticket ID to cancel: ");
        int id = sc.nextInt();

        Iterator<Ticket> it = tickets.iterator();
        while (it.hasNext()) {
            Ticket t = it.next();
            if (t.id == id) {
                it.remove();
                System.out.println("Ticket cancelled successfully!\n");
                return;
            }
        }

        System.out.println("Ticket not found.\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Search Ticket");
            System.out.println("4. Cancel Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> bookTicket();
                case 2 -> viewTickets();
                case 3 -> searchTicket();
                case 4 -> cancelTicket();
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