import java.util.Scanner;

class Employee {

  int employeeId;
  String name;
  double basicSalary;

  Employee(int id, String n, double salary) {
    employeeId = id;
    name = n;
    basicSalary = salary;
  }

  void displaySalary() {

    double hra = basicSalary * 0.20;
    double da = basicSalary * 0.10;
    double grossSalary = basicSalary + hra + da;

    System.out.println("\n===== Employee Details =====");
    System.out.println("Employee ID: " + employeeId);
    System.out.println("Name: " + name);
    System.out.println("Basic Salary: " + basicSalary);
    System.out.println("HRA: " + hra);
    System.out.println("DA: " + da);
    System.out.println("Gross Salary: " + grossSalary);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Employee ID: ");
    int id = sc.nextInt();

    sc.nextLine(); 

    System.out.print("Enter Employee Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Basic Salary: ");
    double salary = sc.nextDouble();

    Employee emp = new Employee(id, name, salary);
    
    emp.displaySalary();

    sc.close();
  }
}
