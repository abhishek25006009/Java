import java.util.Scanner;

class Patient {

    int patientId;
    String name;
    int age;
    double temperature;

    Patient(int patientId, String name, int age, double temperature) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.temperature = temperature;
    }

    void checkFever() {
        if (temperature > 100.4) {
            System.out.println("Fever");
        } else {
            System.out.println("Normal");
        }
    }

    void displayPatient() {
        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.print("Status: ");
        checkFever();
    }
}

public class HospitalManagement {
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
        double temperature = sc.nextDouble();

        Patient patient = new Patient(id, name, age, temperature);

        patient.displayPatient();

        sc.close();
    }
}