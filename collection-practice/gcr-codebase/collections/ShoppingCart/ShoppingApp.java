package ShoppingCart;

public class ShoppingApp {

	public static void main(String[] args) {
		
		ShopingOperations cart = new ShopingOperations();

        cart.addToCart("Macbook", 75000);
        cart.addToCart("Iphone", 125000);
        cart.addToCart("Headphones", 3200);
        cart.addToCart("Keyboard", 1500);

        cart.displayProducts();
        cart.displayCartOrder();
        cart.displaySortedByPrice();

	}

}
