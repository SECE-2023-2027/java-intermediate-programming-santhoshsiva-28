import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = (price < 0) ? 0 : price;
        this.stockQuantity = (stockQuantity < 0) ? 0 : stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stock = sc.nextInt();

        Product p = new Product(id, name, price, stock);

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        p.applyDiscount(discount);

        System.out.println("Price after Discount: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        sc.close();
    }
}