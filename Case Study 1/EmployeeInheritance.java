import java.util.Scanner;

class Employe {
    String name;
    double salary;

    Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employe {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    double totalSalary() {
        return salary + bonus;
    }

    void displayManager() {
        display();
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + totalSalary());
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double employeeSalary = sc.nextDouble();

        Employe emp = new Employe(employeeName, employeeSalary);

        sc.nextLine();

        System.out.print("\nEnter Manager Name: ");
        String managerName = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Manager manager = new Manager(
                managerName, managerSalary, bonus
        );

        System.out.println("\n----- Employee Details -----");
        emp.display();

        System.out.println("\n----- Manager Details -----");
        manager.displayManager();

        sc.close();
    }
}