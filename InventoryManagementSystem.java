import java.util.*;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class InventoryManagementSystem {
    private static List<Product> inventory = new ArrayList<>();
    private static int nextId = 1;

    public static void addProduct(String name, int quantity, double price) {
        Product newProduct = new Product(nextId++, name, quantity, price);
        inventory.add(newProduct);
        System.out.println("Product added successfully.");
    }

    public static void updateProduct(int id, int quantity, double price) {
        for (Product product : inventory) {
            if (product.id == id) {
                product.quantity = quantity;
                product.price = price;
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public static void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        for (Product product : inventory) {
            System.out.println("ID: " + product.id +
                    ", Name: " + product.name +
                    ", Quantity: " + product.quantity +
                    ", Price: " + product.price);
        }
    }

    public static void deleteProduct(int id) {
        Iterator<Product> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.id == id) {
                iterator.remove();
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Inventory Menu =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. View Products");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    addProduct(name, quantity, price);
                    break;

                case 2:
                    System.out.print("Enter product ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    updateProduct(updateId, newQuantity, newPrice);
                    break;

                case 3:
                    viewProducts();
                    break;

                case 4:
                    System.out.print("Enter product ID to delete: ");
                    int deleteId = scanner.nextInt();
                    deleteProduct(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
