class ProductInventry {

    // instance variables
    String productName;
    double price;

    // class variable (shared)
    static int totalProducts = 0;

    // constructor
    ProductInventry(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    // class method
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
 class Product {
    public static void main(String[] args) {

        ProductInventry p1 = new ProductInventry("Laptop", 65000);
        ProductInventry p2 = new ProductInventry("Mobile", 30000);

        p1.displayProductDetails();
        System.out.println();

        p2.displayProductDetails();
        System.out.println();

        ProductInventry.displayTotalProducts();
    }
}
