import java.util.Scanner;

class Patient {

  int patientId;
  String name;
  int age;
  double temperature;

  Patient(int id, String n, int a, double temp) {
    patientId = id;
    name = n;
    age = a;
    temperature = temp;
  }

  void checkFever() {
    if (temperature > 100.4) {
      System.out.println("Status: Fever");
    } else {
      System.out.println("Status: Normal");
    }
  }

  void displayPatient() {
    System.out.println("\n===== Patient Details =====");
    System.out.println("Patient ID: " + patientId);
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Temperature: " + temperature + "°F");

    checkFever();
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Patient ID: ");
    int id = sc.nextInt();

    sc.nextLine();

    System.out.print("Enter Patient Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Age: ");
    int age = sc.nextInt();

    System.out.print("Enter Temperature (°F): ");
    double temp = sc.nextDouble();

    Patient p = new Patient(id, name, age, temp);

    p.displayPatient();

    sc.close();
  }
}
