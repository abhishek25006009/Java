import java.util.Scanner;
import java.util.InputMismatchException;

public class BankWithdrawalDemo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double balance = 10000;

    try {
      System.out.println("Current Balance: ₹" + balance);

      System.out.print("Enter withdrawal amount: ₹");
      double amount = sc.nextDouble();

      if (amount <= 0) {
        throw new IllegalArgumentException(
                "Invalid withdrawal amount. Amount must be greater than 0."
        );
      }

      if (amount > balance) {
        throw new IllegalArgumentException(
                "Insufficient balance. Available balance is ₹" + balance
        );
      }

      balance = balance - amount;

      System.out.println("\n----- Withdrawal Successful -----");
      System.out.println("Amount Withdrawn: ₹" + amount);
      System.out.println("Remaining Balance: ₹" + balance);

    } catch (InputMismatchException e) {

      System.out.println(
              "Invalid input. Please enter a numeric value."
      );

    } catch (IllegalArgumentException e) {

      System.out.println(e.getMessage());

    } finally {

      sc.close();
    }
  }
}