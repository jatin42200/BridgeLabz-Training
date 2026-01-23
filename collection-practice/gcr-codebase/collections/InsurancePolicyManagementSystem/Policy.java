package InsurancePolicyManagementSystem;

import java.time.*;
import java.util.*;

public class Policy implements Comparable<Policy>{
	private String policyNumber;
	private String holderName;
	private LocalDate expiryDate;
	private String coverageType;
	private double premiumAmount;
	
	public Policy(String policyNumber,String holderName,LocalDate expiryDate,String coverageType,double premiumAmount) {
		this.policyNumber = policyNumber;
		this.holderName = holderName;
		this.expiryDate = expiryDate;
		this.coverageType = coverageType;
		this.premiumAmount = premiumAmount;
	}
	
	public String getPolicyNumber() {
        return policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public int compareTo(Policy p) {
        int result = this.expiryDate.compareTo(p.expiryDate);
        return result == 0 ? this.policyNumber.compareTo(p.policyNumber) : result;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiryDate + " | " + coverageType + " | " + premiumAmount;
    }
	
}
