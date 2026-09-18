import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount +
                " made using Credit Card.");
    }
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount +
                " made using UPI.");
    }
}

class NetBanking implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount +
                " made using Net Banking.");
    }
}

public class ECommercePayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ₹");
        double amount = sc.nextDouble();

        System.out.println("\n===== Payment Methods =====");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Payment payment;

        switch (choice) {

            case 1:
                payment = new CreditCard();
                payment.pay(amount);
                break;

            case 2:
                payment = new UPI();
                payment.pay(amount);
                break;

            case 3:
                payment = new NetBanking();
                payment.pay(amount);
                break;

            default:
                System.out.println("Invalid payment method.");
        }

        sc.close();
    }
}