public class ProfitLoss {
    public static void main(String[] args) {
        // Initialize CP and SP
        double CP=129;
        double SP=191;
        double profit=SP-CP;//Here we calculate profit
        double profitPer= (profit/CP) * 100;
        //print output
        System.out.println("The Cost Price is INR "+CP+" and Selling Price is INR "+SP+"\n"+
            "The Profit is INR "+profit+" and the Profit Percentage is "+profitPer+ "%"
        );
    }
}