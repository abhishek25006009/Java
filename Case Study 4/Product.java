import java.util.ArrayList;
import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    Product(int id, String name, double p, int q) {
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println(productId + "  " + productName
                + "  " + price + "  " + quantity
                + "  " + getTotalCost());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> cart = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product p = new Product(id, name, price, quantity);

            cart.add(p);
        }

        double totalBill = 0;

        System.out.println("\n===== SHOPPING CART =====");
        System.out.println("ID   Name   Price   Quantity   Total");

        for (Product p : cart) {
            p.display();
            totalBill = totalBill + p.getTotalCost();
        }

        System.out.println("\nTotal Bill: ₹" + totalBill);

        if (totalBill > 5000) {

            double discount = totalBill * 0.10;
            double finalBill = totalBill - discount;

            System.out.println("Discount (10%): ₹" + discount);
            System.out.println("Final Bill: ₹" + finalBill);

        } else {
            System.out.println("No discount");
            System.out.println("Final Bill: ₹" + totalBill);
        }

        sc.close();
    }
}
