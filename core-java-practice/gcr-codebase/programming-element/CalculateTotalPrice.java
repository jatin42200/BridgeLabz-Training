import java.util.Scanner;
    class Total_Price
      {
    public static void main(String[] args)
       {
       Scanner sc = new Scanner(System.in);    
       //here we declear an element 
        double unitPrice;
        int quantity;

        // here we take user input
        unitPrice = sc.nextDouble();
        quantity = sc.nextInt();

        //here we calculate total price
        double totalPrice = unitPrice*quantity;
        // here we print the output 
        System.out.println("The total purchase price is INR " +totalPrice+" if the quantity " +quantity+" and unit price is INR " + unitPrice);
  }
}
