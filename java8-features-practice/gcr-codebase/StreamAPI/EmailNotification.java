import java.util.Arrays;
import java.util.List;

public class EmailNotification {

	public static void main(String[] args) {
		List<String> emails = Arrays.asList(
	            "user1@gmail.com",
	            "user2@gmail.com",
	            "user3@gmail.com");

	    emails.forEach(email -> System.out.println("Sending notification email to: " + email));

	}

}
