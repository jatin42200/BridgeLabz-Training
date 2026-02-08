package PaymentGatewayIntegration;

public class PaymentApp {

	public static void main(String[] args) {
		PaymentProcessor p1 = new UpiPayment();
        PaymentProcessor p2 = new CreditCardPayment();

        p1.pay(1000);
        p1.refund(500);

        p2.pay(2000);
        p2.refund(800);

	}

}
