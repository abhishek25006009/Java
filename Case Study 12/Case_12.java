import java.util.Scanner;
import java.util.InputMismatchException;

class Bankbccount {

    double balance = 5000;

    void withdraw(double amount) throws Exception {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Invalid withdrawal amount!"
            );
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful!");
        System.out.println("Amount withdrawn: ₹" + amount);
        System.out.println("Remaining balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bankbccount account = new Bankbccount();

        try {

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        }
        catch (InputMismatchException e) {
            System.out.println(
                    "Invalid input! Please enter a number.");
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
