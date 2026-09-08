import java.util.Scanner;

public class Case_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int total = 0;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            int marks = sc.nextInt();
            total = total + marks;
        }

        double percentage = total / 5.0;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        }
        else if (percentage >= 80) {
            System.out.println("Grade: A");
        }
        else if (percentage >= 70) {
            System.out.println("Grade: B");
        }
        else if (percentage >= 60) {
            System.out.println("Grade: C");
        }
        else if (percentage >= 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F");
        }

        if (percentage >= 50) {
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }
        sc.close();
    }
}
