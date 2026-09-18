import java.util.Scanner;

public class BusTicketBookingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableSeats = 50;

        try {
            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new IllegalArgumentException("Invalid age. Age must be greater than 0.");
            }

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            if (seats <= 0) {
                throw new IllegalArgumentException(
                        "Invalid number of seats. Seats must be greater than 0."
                );
            }

            if (seats > availableSeats) {
                throw new IllegalArgumentException(
                        "Insufficient seats. Only " + availableSeats + " seats are available."
                );
            }

            availableSeats = availableSeats - seats;

            System.out.println("\n----- Booking Successful -----");
            System.out.println("Passenger Age: " + age);
            System.out.println("Seats Booked: " + seats);
            System.out.println("Remaining Seats: " + availableSeats);

        } catch (java.util.InputMismatchException e) {

            System.out.println("Invalid input. Please enter numbers only.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();
        }
    }
}