import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentResultDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new ArithmeticException(
                        "Division by zero. No subjects have been entered."
                );
            }

            int total = 0;

            for (int i = 1; i <= n; i++) {

                System.out.print("Enter marks for subject " + i + ": ");
                int marks = sc.nextInt();

                if (marks < 0 || marks > 100) {
                    throw new IllegalArgumentException(
                            "Invalid marks. Marks must be between 0 and 100."
                    );
                }

                total = total + marks;
            }

            double average = (double) total / n;

            System.out.println("\n----- Examination Result -----");
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

        } catch (InputMismatchException e) {

            System.out.println(
                    "Invalid input. Please enter numbers only."
            );

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        } finally {

            sc.close();
        }
    }
}