public class Discount {
    public static void main(String[] args) {
        //initialize fees and discount
        double fees=125000;
        double discountPer=10;
        double discount=(fees*discountPer)/100;//discount nikaalne ke liye 
        double GivenFees=fees-discount;//total given fees nikaalne ke liye
         //printing
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+GivenFees);
    }
}