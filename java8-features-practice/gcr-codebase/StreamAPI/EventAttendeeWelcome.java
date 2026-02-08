import java.util.*;
public class EventAttendeeWelcome {

	public static void main(String[] args) {
		List<String> attendees = Arrays.asList("Amit", "Neha", "Karan", "Riya");

	    attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));

	}

}
