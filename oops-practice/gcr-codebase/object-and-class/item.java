
class Item {

    String itemCode;
    String itemName;
    double price;

    void displayItemDetails(int quantity) {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);

        double totalCost = price * quantity;
        System.out.println("Total Cost for " + quantity + " items : " + totalCost);
        System.out.println("----------------------------");
    }
}
    class displayItemDetails{
        public static void main(String[] args) {

        Item i1 = new Item();
        i1.itemCode = "01AA";
        i1.itemName = "Water bottle";
        i1.price = 500.0;
        i1.displayItemDetails(1);

        Item i2 = new Item();
        i2.itemCode = "01BB";
        i2.itemName = "Rice";
        i2.price = 700.0;
        i2.displayItemDetails(1);

        Item i3 = new Item();
        i3.itemCode = "02AA";
        i3.itemName = "blackboard";
        i3.price = 400.0;
        i3.displayItemDetails(1);
    }
}

    

