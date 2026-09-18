import java.util.Scanner;
import java.util.InputMismatchException;

public class OnlineShoppingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product price: ₹");
            double price = sc.nextDouble();

            if (price <= 0) {
                throw new IllegalArgumentException(
                        "Invalid product price. Price must be greater than 0."
                );
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new IllegalArgumentException(
                        "Invalid quantity. Quantity must be greater than 0."
                );
            }

            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();

            if (discount < 0 || discount > 100) {
                throw new IllegalArgumentException(
                        "Invalid discount. Discount must be between 0 and 100."
                );
            }

            double total = price * quantity;
            double discountAmount = total * discount / 100;
            double finalBill = total - discountAmount;

            System.out.println("\n----- Bill Details -----");
            System.out.println("Product Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Amount: ₹" + total);
            System.out.println("Discount: ₹" + discountAmount);
            System.out.println("Final Bill: ₹" + finalBill);

            System.out.print("\nEnter payment amount: ₹");
            double payment = sc.nextDouble();

            if (payment < finalBill) {
                throw new IllegalArgumentException(
                        "Payment amount is less than the bill."
                );
            }

            double change = payment - finalBill;

            System.out.println("Payment successful.");
            System.out.println("Change: ₹" + change);

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid input. Please enter numbers only."
            );

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();
        }
    }
}