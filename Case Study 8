import java.util.Scanner;

class Employe {

    String name;
    double salary;

    Employe(String n, double s) {
        name = n;
        salary = s;
    }

    void displayEmploye() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employe {

    double bonus;

    // Constructor
    Manager(String n, double s, double b) {
        super(n, s);
        bonus = b;
    }

    void displayManager() {
        displayEmploye();
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + (salary + bonus));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        Employe emp = new Employe(empName, empSalary);

        sc.nextLine();

        System.out.print("\nEnter Manager Name: ");
        String managerName = sc.nextLine();

        System.out.print("Enter Manager Salary: ");
        double managerSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Manager manager = new Manager(managerName, managerSalary, bonus);

        System.out.println("\n===== EMPLOYEE =====");
        emp.displayEmploye();

        System.out.println("\n===== MANAGER =====");
        manager.displayManager();

        sc.close();
    }
}
