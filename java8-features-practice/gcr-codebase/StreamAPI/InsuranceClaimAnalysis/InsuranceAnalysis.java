package InsuranceClaimAnalysis;

import java.util.*;
import java.util.stream.*;

public class InsuranceAnalysis {

	public static void main(String[] args) {
		List<InsuranceClaim> claims = Arrays.asList(
	            new InsuranceClaim("Health", 50000),
	            new InsuranceClaim("Health", 70000),
	            new InsuranceClaim("Vehicle", 30000),
	            new InsuranceClaim("Vehicle", 45000),
	            new InsuranceClaim("Life", 100000)
	    );
		
		Map<String, Double> averageClaimByType =
                claims.stream().collect(Collectors.groupingBy(
                              InsuranceClaim::getClaimType,
                              Collectors.averagingDouble(InsuranceClaim::getClaimAmount)));

        averageClaimByType.forEach((type, avg) ->
            System.out.println(type + " - Average Claim: " + avg)
        );


	}

}
