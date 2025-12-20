
import java.util.Scanner;

public class Coffee_Counter_Chronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Price list for different different coffee types
        double ESPRESSO_PRICE = 70.0;
        double CAPPUCCINO_PRICE = 100.0;
        double LATTE_PRICE = 130.0;
        double MOCHA_PRICE = 50.0;
        double AMERICANO_PRICE = 110.0;
        double GST_RATE = 0.05; // 5% GST for coffee
        
        System.out.println(" <-------Welcome to Ravi's Café ------->\n");
        
        while (true) {
            System.out.print("Enter coffee type (Espresso/Cappuccino/Latte/Americano) or 'exit' to quit: ");
            String coffee_Type = sc.nextLine().toLowerCase();
            
            // Exit IF coustomer don't want to buy any coffee
            if (coffee_Type.equals("exit")) {
                System.out.println("\nThank you for visiting Ravi's Cafe! Have a great day!");
                break;
            }
            
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            
            double price_PerCup = 0.0;
            boolean valid_Coffee = true;
            
            // Switch to find out coffee price
            switch (coffee_Type) {
                case "espresso":
                    price_PerCup = ESPRESSO_PRICE;
                    break;
                 case "mocha":
                    price_PerCup = MOCHA_PRICE;
                    break;
                case "cappuccino":
                    price_PerCup = CAPPUCCINO_PRICE;
                    break;
                case "latte":
                    price_PerCup = LATTE_PRICE;
                    break;
                case "americano":
                    price_PerCup = AMERICANO_PRICE;
                    break;
                default:
                    System.out.println("Invalid coffee type! Please try again.\n");
                    valid_Coffee = false;
                    continue; // Skip to next iteration
            }
            
            if (valid_Coffee) {
                //Here We Calculate total bill
                double sub_total = price_PerCup * quantity;
                double gst_Amount = sub_total * GST_RATE;
                double total_Bill = sub_total + gst_Amount;
                
                //Here We Display bill
                System.out.println("\n<--------- Bill Summary -------->");
                System.out.println("Coffee Type: " + coffee_Type.substring(0, 1).toUpperCase() + coffee_Type.substring(1));
                System.out.println("Quantity: " + quantity);
                System.out.println("Price per cup: $" + price_PerCup);
                System.out.println("Subtotal: $" + sub_total);
                System.out.println("GST (5%): $" + gst_Amount);
                System.out.println("Total Bill: $" + total_Bill);
                System.out.println("----------------------------------\n");
            }
        }
 
    }
}