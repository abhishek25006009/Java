import java.util.Scanner;

class BankAccountSync {

    private int balance = 10000;

    synchronized void withdraw(String customer, int amount) {

        System.out.println("\n" + customer +
                " is trying to withdraw ₹" + amount);

        if (amount <= balance) {

            System.out.println(customer + " is processing...");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }

            balance = balance - amount;

            System.out.println(customer +
                    " successfully withdrew ₹" + amount);

            System.out.println("Remaining Balance: ₹" + balance);

        } else {
            System.out.println(customer +
                    " cannot withdraw. Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("\nFinal Balance: ₹" + balance);
    }
}

class CustomerThread extends Thread {

    BankAccountSync account;
    String customerName;
    int amount;

    CustomerThread(BankAccountSync account,
                   String customerName,
                   int amount) {

        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(customerName, amount);
    }
}

public class BankMultipleWithdrawal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccountSync account = new BankAccountSync();

        System.out.print("Enter Customer 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter withdrawal amount for Customer 1: ₹");
        int amount1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer 2 name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter withdrawal amount for Customer 2: ₹");
        int amount2 = sc.nextInt();

        CustomerThread customer1 =
                new CustomerThread(account, name1, amount1);

        CustomerThread customer2 =
                new CustomerThread(account, name2, amount2);

        customer1.start();
        customer2.start();

        try {
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        account.displayBalance();

        sc.close();
    }
}