import java.util.ArrayList;
import java.util.List;

// 1. Custom Exception
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

// 2. Interface for Alert System
interface AlertService {
    void sendAlert(String productName, int currentStock);
}

// 3. Product Model (Encapsulation)
class Product {
    private String name;
    private int stockQuantity;
    private int lowStockThreshold;

    public Product(String name, int stockQuantity, int lowStockThreshold) {
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.lowStockThreshold = lowStockThreshold;
    }

    // Getters and Setters
    public String getName() { return name; }
    public int getStockQuantity() { return stockQuantity; }
    public int getLowStockThreshold() { return lowStockThreshold; }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Insufficient stock for: " + name);
        }
        this.stockQuantity -= quantity;
    }

    public void addStock(int quantity) {
        this.stockQuantity += quantity;
    }
}

// 4. Inventory Logic with Alert Service
class Warehouse implements AlertService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void processSale(String productName, int quantity) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                try {
                    p.reduceStock(quantity);
                    System.out.println("Sold " + quantity + " units of " + productName);
                    
                    // Check for Low Stock Alert
                    if (p.getStockQuantity() <= p.getLowStockThreshold()) {
                        sendAlert(p.getName(), p.getStockQuantity());
                    }
                } catch (OutOfStockException e) {
                    System.err.println("ALERT: " + e.getMessage());
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }

    @Override
    public void sendAlert(String productName, int currentStock) {
        System.out.println("[LOW STOCK ALERT]: " + productName + " is running low! Current stock: " + currentStock);
    }
}

// 5. Main Class
public class InventorySystem {
    public static void main(String[] args) {
        Warehouse myWarehouse = new Warehouse();

        // Adding Products (Name, Initial Stock, Low Stock Threshold)
        Product p1 = new Product("iPhone 15", 10, 3);
        Product p2 = new Product("Airpods", 5, 2);

        myWarehouse.addProduct(p1);
        myWarehouse.addProduct(p2);

        System.out.println("--- Inventory Management Start ---\n");

        // Normal Sale
        myWarehouse.processSale("iPhone 15", 5); 

        // Sale that triggers Low Stock Alert
        myWarehouse.processSale("iPhone 15", 3); // Stock remains 2, which is < threshold (3)

        // Sale that triggers OutOfStockException
        myWarehouse.processSale("Airpods", 10); 

        System.out.println("\n--- Inventory Update Complete ---");
    }
}