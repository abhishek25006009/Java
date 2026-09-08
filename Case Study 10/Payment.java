import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

class NetBanking implements Payment {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Net Banking.");
    }
}

class ECommerce {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter payment amount: ₹");
        double amount = sc.nextDouble();

        System.out.println("\n===== PAYMENT METHODS =====");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        Payment payment;

        switch (choice) {

            case 1:
                payment = new CreditCard();
                break;

            case 2:
                payment = new UPI();
                break;

            case 3:
                payment = new NetBanking();
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        payment.pay(amount);

        sc.close();
    }
}
