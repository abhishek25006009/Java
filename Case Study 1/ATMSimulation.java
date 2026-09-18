import java.util.Scanner;

class ATM {

    int pin = 1234;
    double balance = 10000;

    boolean checkPin(int enteredPin) {
        return enteredPin == pin;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class ATMSimulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        int attempts = 0;
        boolean authenticated = false;

        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (atm.checkPin(enteredPin)) {
                authenticated = true;
                System.out.println("PIN correct. Login successful.");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN.");

                if (attempts < 3) {
                    System.out.println("Attempts remaining: " + (3 - attempts));
                }
            }
        }

        if (!authenticated) {
            System.out.println("Maximum attempts exceeded.");
            System.out.println("Your account is locked.");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 3:
                    atm.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}