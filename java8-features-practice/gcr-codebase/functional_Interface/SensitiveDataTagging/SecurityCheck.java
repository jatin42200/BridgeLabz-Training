package SensitiveDataTagging;

public class SecurityCheck {

	public static void main(String[] args) {
		CustomerData data = new CustomerData();

        if (data instanceof Sensitive) {
            System.out.println("Encrypt this data");
        } else {
            System.out.println("No encryption needed");
        }

	}

}
