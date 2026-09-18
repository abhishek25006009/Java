import java.util.Scanner;

class FoodPreparationThread extends Thread {

    String foodName;

    FoodPreparationThread(String foodName) {
        this.foodName = foodName;
    }

    public void run() {

        System.out.println("\nPreparing " + foodName + "...");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Food preparation interrupted.");
        }

        System.out.println(foodName + " preparation completed.");
    }
}

class FoodDeliveryThread extends Thread {

    String customerName;

    FoodDeliveryThread(String customerName) {
        this.customerName = customerName;
    }

    public void run() {

        System.out.println("\nDelivering food to " + customerName + "...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Delivery interrupted.");
        }

        System.out.println("Food delivered successfully to " + customerName + ".");
    }
}

public class FoodDeliveryDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food name: ");
        String foodName = sc.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        FoodPreparationThread preparation =
                new FoodPreparationThread(foodName);

        preparation.start();

        try {
            preparation.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        FoodDeliveryThread delivery =
                new FoodDeliveryThread(customerName);

        delivery.start();

        try {
            delivery.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("\n----- Order Completed -----");

        sc.close();
    }
}