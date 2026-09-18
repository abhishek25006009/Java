import java.util.Scanner;

class Student {

    String name;
    String[] courses = new String[5];
    int courseCount = 0;

    Student(String name) {
        this.name = name;
    }

    void registerCourse(String courseName) {

        if (courseCount < 5) {
            courses[courseCount] = courseName;
            courseCount++;

            System.out.println("Course registered successfully.");
        } else {
            System.out.println("Cannot register more than 5 courses.");
        }
    }

    void displayCourses() {

        System.out.println("\n----- Registered Courses -----");
        System.out.println("Student Name: " + name);

        if (courseCount == 0) {
            System.out.println("No courses registered.");
        } else {
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i]);
            }
        }
    }
}

public class CourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(name);

        int choice;

        do {
            System.out.println("\n===== University Course Registration =====");
            System.out.println("1. Register Course");
            System.out.println("2. Display Courses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Course Name: ");
                    String courseName = sc.nextLine();

                    student.registerCourse(courseName);
                    break;

                case 2:
                    student.displayCourses();
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}