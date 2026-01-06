import java.util.*;

public class MenuApp {

    public static void main(String[] args) {
        String[] menuItems = {
            "Veg Sandwich", "Cheese Burger", "French Fries", 
            "Pasta", "Pizza", "Noodles", 
            "Coffee", "Tea", "Juice", "Ice Cream"
        };

        Scanner sc = new Scanner(System.in);
        boolean ordering = true;

        System.out.println("=== Welcome to the Java Cafeteria ===");

        while (ordering) {
            displayItems(menuItems);
            System.out.print("\nEnter item index to order (or -1 to exit): ");
            
            // Checking if the input is actually an integer
            if (sc.hasNextInt()) {
                int index = sc.nextInt();

                if (index == -1) {
                    ordering = false;
                    System.out.println("Thank you for visiting!");
                } else {
                    String selectedItem = getItemByIndex(menuItems, index);
                    if (selectedItem != null) {
                        System.out.println("\n>>> SUCCESS: You ordered: " + selectedItem + " <<<");
                    } else {
                        System.out.println("\n>>> ERROR: Invalid index! Please pick 0-9. <<<");
                    }
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input from scanner
            }
            System.out.println();
        }
        sc.close();
    }

    public static void displayItems(String[] menu) {
        System.out.println("\n------- MENU -------");
        for (int i = 0; i < menu.length; i++) {
            // Using printf for aligned columns
            System.out.printf("[%d] %-15s %n", i, menu[i]);
        }
        System.out.println("--------------------");
    }

    public static String getItemByIndex(String[] items, int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        return null;
    }
}