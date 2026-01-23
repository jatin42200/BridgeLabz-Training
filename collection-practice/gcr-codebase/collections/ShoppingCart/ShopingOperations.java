package ShoppingCart;

import java.util.*;

public class ShopingOperations {

	HashMap<String,Double> productMap = new HashMap<>();
	LinkedHashMap<String,Double> productOrder = new LinkedHashMap<>();
	
	public void addToCart(String name,double price) {
		productMap.put(name, price);
		productOrder.put(name, price);
	}
	
	public void displayProducts() {
		for(Map.Entry<String, Double> entry : productMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
	}
	
	// Display cart order (LinkedHashMap)
    public void displayCartOrder() {
        System.out.println("\nCart Order (LinkedHashMap):");
        for (Map.Entry<String, Double> entry : productOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    
 // Display items sorted by price (TreeMap)
    public void displaySortedByPrice() {
        System.out.println("\nItems Sorted by Price:");

        TreeMap<Double, String> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " -> " + entry.getKey());
        }
    }

}
