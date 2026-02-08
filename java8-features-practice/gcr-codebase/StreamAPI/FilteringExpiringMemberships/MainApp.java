package FilteringExpiringMemberships;

import java.time.*;
import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		List<Member> members = Arrays.asList(
	            new Member("Amit", LocalDate.now().plusDays(10)),
	            new Member("Riya", LocalDate.now().plusDays(40)),
	            new Member("Karan", LocalDate.now().plusDays(25)),
	            new Member("Neha", LocalDate.now().minusDays(5)));
		LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        
        List<Member> expiringSoon = members.stream().filter(m -> m.expiryDate.isAfter(today) && m.expiryDate.isBefore(next30Days)).toList();
        expiringSoon.forEach(m -> System.out.println(m.name + " expires on " + m.expiryDate));

	}

}
