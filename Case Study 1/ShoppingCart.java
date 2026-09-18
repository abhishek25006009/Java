import java.util.Scanner;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

    Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println(
                productId + "\t" + productName + "\t₹" +
                        price + "\t" + quantity + "\t₹" +
                        calculateTotalCost()
        );
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Product " + (i + 1));

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(id, name, price, quantity);
        }

        System.out.println("\n----------- Shopping Cart -----------");
        System.out.println("ID\tName\tPrice\tQty\tTotal");

        double totalBill = 0;

        for (Product product : products) {
            product.displayProduct();
            totalBill += product.calculateTotalCost();
        }

        double discount = 0;

        if (totalBill > 5000) {
            discount = totalBill * 0.10;
        }

        double finalBill = totalBill - discount;

        System.out.println("\n-------------------------------------");
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Bill: ₹" + finalBill);

        sc.close();
    }
}