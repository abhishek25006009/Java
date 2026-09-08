import java.util.ArrayList;
import java.util.Scanner;

class Student {

    String name;
    ArrayList<String> courses = new ArrayList<>();

    Student(String n) {
        name = n;
    }

    void registerCourse(String course) {

        if (courses.size() < 5) {
            courses.add(course);
            System.out.println("Course registered successfully.");
        } else {
            System.out.println("Cannot register more than 5 courses!");
        }
    }

    void displayCourses() {

        System.out.println("\n===== REGISTERED COURSES =====");

        if (courses.size() == 0) {
            System.out.println("No courses registered.");
        } else {
            for (String course : courses) {
                System.out.println(course);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student student = new Student(name);

        while (true) {

            System.out.println("\n===== COURSE MENU =====");
            System.out.println("1. Register Course");
            System.out.println("2. Display Courses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();

                    student.registerCourse(course);
                    break;

                case 2:
                    student.displayCourses();
                    break;

                case 3:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
