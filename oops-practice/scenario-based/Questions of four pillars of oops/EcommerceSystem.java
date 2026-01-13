// 1. Custom Exception
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

// 2. Interface for Polymorphism
interface Payment {
    void processPayment(double amount) throws PaymentFailedException;
}

// 3. Different Payment Implementations (Polymorphism)
class CardPayment implements Payment {
    @Override
    public void processPayment(double amount) throws PaymentFailedException {
        System.out.println("Processing Card Payment of ₹" + amount + "...");
        System.out.println("Payment Successful via Credit/Debit Card.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void processPayment(double amount) throws PaymentFailedException {
        // Simulating a failure for high amounts
        if (amount > 50000) {
            throw new PaymentFailedException("Transaction Failed: UPI limit is ₹50,000 per day.");
        }
        System.out.println("Processing UPI Payment of ₹" + amount + "...");
        System.out.println("Payment Successful via UPI.");
    }
}

// 4. OOP Models (Product & Order)
class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    Product product;
    String status;

    public Order(int orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
        this.status = "PLACED";
    }

    public void displayStatus() {
        System.out.println("Order ID: " + orderId + " | Item: " + product.name + " | Status: " + status);
    }

    public void cancelOrder() {
        this.status = "CANCELLED";
        System.out.println("Order " + orderId + " has been cancelled successfully.");
    }
}

// 5. Main Execution Class
public class EcommerceSystem {
    public static void main(String[] args) {
        System.out.println("--- Welcome to E-Store --- \n");

        // Products setup
        Product laptop = new Product(101, "MacBook Air", 85000.0);
        Product watch = new Product(102, "Fastrack Watch", 2500.0);

        // Case 1: Successful Order using UPI
        try {
            System.out.println("Step 1: Buying " + watch.name);
            Payment upi = new UPIPayment(); // Interface reference
            upi.processPayment(watch.price);

            Order order1 = new Order(5001, watch);
            order1.displayStatus();
            
            System.out.println("---------------------------");

            // Case 2: Failed Order (Exception Handling)
            System.out.println("Step 2: Buying " + laptop.name);
            upi.processPayment(laptop.price); // This will throw exception

            Order order2 = new Order(5002, laptop);
            order2.displayStatus();

        } catch (PaymentFailedException e) {
            System.out.println("ERROR: " + e.getMessage());
            System.out.println("Order could not be processed.");
        }

        System.out.println("\n--- End of Transaction ---");
    }
}