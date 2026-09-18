import java.util.Scanner;

class Theatre {

    private int availableSeats = 5;

    synchronized void bookSeats(String customerName, int seats) {

        System.out.println("\n" + customerName +
                " is trying to book " + seats + " seat(s).");

        if (seats <= availableSeats) {

            System.out.println(customerName + " is booking seats...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }

            availableSeats = availableSeats - seats;

            System.out.println(customerName +
                    " successfully booked " + seats + " seat(s).");

            System.out.println("Remaining seats: " + availableSeats);

        } else {

            System.out.println(customerName +
                    " could not book seats. Only " +
                    availableSeats + " seat(s) available.");
        }
    }

    void displaySeats() {
        System.out.println("\nFinal Available Seats: " + availableSeats);
    }
}

class TicketCustomer extends Thread {

    Theatre theatre;
    String customerName;
    int seats;

    TicketCustomer(Theatre theatre, String customerName, int seats) {
        this.theatre = theatre;
        this.customerName = customerName;
        this.seats = seats;
    }

    public void run() {
        theatre.bookSeats(customerName, seats);
    }
}

public class OnlineTicketBookingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Theatre theatre = new Theatre();

        System.out.print("Enter Customer 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter seats for Customer 1: ");
        int seats1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer 2 name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter seats for Customer 2: ");
        int seats2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer 3 name: ");
        String name3 = sc.nextLine();

        System.out.print("Enter seats for Customer 3: ");
        int seats3 = sc.nextInt();

        TicketCustomer customer1 =
                new TicketCustomer(theatre, name1, seats1);

        TicketCustomer customer2 =
                new TicketCustomer(theatre, name2, seats2);

        TicketCustomer customer3 =
                new TicketCustomer(theatre, name3, seats3);

        customer1.start();
        customer2.start();
        customer3.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        theatre.displaySeats();

        sc.close();
    }
}