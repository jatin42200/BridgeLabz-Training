package PaymentGatewayIntegration;

public class UpiPayment implements PaymentProcessor{

	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI");
    }

}
