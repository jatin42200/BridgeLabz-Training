package InsurancePolicyManagementSystem;

import java.util.*;
import java.time.*;

public class InsuranceApp {

	public static void main(String[] args) {
		PolicyManager policyManager = new PolicyManager();

        Policy p1 = new Policy("P101", "Aman",LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Ravi",LocalDate.now().plusDays(40), "Auto", 8000);
        Policy p3 = new Policy("P103", "Neha",LocalDate.now().plusDays(20), "Home", 12000);
        Policy p4 = new Policy("P101", "Duplicate",LocalDate.now().plusDays(15), "Health", 6000);

        policyManager.addPolicy(p1);
        policyManager.addPolicy(p2);
        policyManager.addPolicy(p3);
        policyManager.addPolicy(p4);

        System.out.println("\n All Unique Policies ");
        policyManager.displayPolicy();

        System.out.println("\n Policies Expiring Soon ");
        policyManager.policiesExpiringSoon();

        System.out.println("\n Health Policies ");
        policyManager.policiesByCoverage("Health");

        System.out.println("\n Duplicate Detection ");
        policyManager.findDuplicatePolicies(Arrays.asList(p1, p2, p3, p4));

	}

}
