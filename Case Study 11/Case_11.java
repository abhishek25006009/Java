import java.util.Scanner;
import java.util.InputMismatchException;

class BusBooking {

    static int availableSeats = 40;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter passenger age: ");
            int age = sc.nextInt();

            if (age <= 0) {
                throw new IllegalArgumentException("Invalid age!");
            }

            System.out.print("Enter number of seats: ");
            int seats = sc.nextInt();

            if (seats <= 0) {
                throw new IllegalArgumentException("Invalid number of seats!");
            }

            if (seats > availableSeats) {
                throw new Exception("Insufficient seats!");
            }

            availableSeats = availableSeats - seats;

            System.out.println("Booking successful!");
            System.out.println("Passenger Age: " + age);
            System.out.println("Seats booked: " + seats);
            System.out.println("Remaining seats: " + availableSeats);

        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
