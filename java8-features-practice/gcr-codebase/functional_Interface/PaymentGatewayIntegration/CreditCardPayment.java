package PaymentGatewayIntegration;

public class CreditCardPayment implements PaymentProcessor{
	public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card");
    }

    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed to Credit Card");
    }
}
