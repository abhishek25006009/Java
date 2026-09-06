import java.util.Scanner;

class BankAccount {

    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount account = new BankAccount(accNo, name, bal);

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
