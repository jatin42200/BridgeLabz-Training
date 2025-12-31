class ShoppingDetail {

    String itemName;
    double price;
    int quantity;

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity);
    }

    public void addItem(int qty) {
        quantity = quantity + qty;
        System.out.println("Added " + qty + " of " + itemName + " to the cart.");
    }

    public void removeItem(int qty) {
        if (quantity >= qty) {
            quantity = quantity - qty;
            System.out.println("Removed " + qty + " of " + itemName + " from the cart.");
        } else {
            System.out.println("Cannot remove more items than present in cart.");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total cost: $" + totalCost);
    }
}

    class CartItem
{
        public static void main(String[] args) {

        ShoppingDetail SD = new ShoppingDetail();
        SD.itemName = "Laptop";
        SD.price = 999.99;
        SD.quantity = 1;

        SD.displayItem();
        SD.addItem(2);
        SD.removeItem(1);
        SD.displayTotalCost();
    }
}

    

