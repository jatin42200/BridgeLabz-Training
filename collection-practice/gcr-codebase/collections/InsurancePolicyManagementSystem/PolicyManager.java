package InsurancePolicyManagementSystem;
import java.util.*;
import java.time.*;

public class PolicyManager {
	
	Set<Policy> hashSet = new HashSet<>();
	Set<Policy> linkedHashSet = new LinkedHashSet<>();
	Set<Policy> treeSet = new TreeSet<>();
	
	//add Policy
	public void addPolicy(Policy policy) {
		hashSet.add(policy);
		linkedHashSet.add(policy);
		treeSet.add(policy);
	}
	
	//display policy
	public void displayPolicy() {
		for (Policy p : hashSet) {
	        System.out.println(p);
	    }
	}
	
	public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isAfter(next30Days)) {
                System.out.println(p);
            }
        }
    }
	
	public void policiesByCoverage(String coverage) {
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }
	
	public void findDuplicatePolicies(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }

        System.out.println("Duplicate Policy Numbers: " + duplicates);
	}
}
