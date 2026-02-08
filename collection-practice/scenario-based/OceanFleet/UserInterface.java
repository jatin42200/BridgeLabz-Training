package OceanFleet;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil util = new VesselUtil();
		
		System.out.println("Enter Number of vessels to be added: ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0;i < num;i++) {
			System.out.println("Enter Details of Vessel: ");
			String input = sc.nextLine();
			
			String[] data = input.split(":");

            String vesselId = data[0];
            String vesselName = data[1];
            double averageSpeed = Double.parseDouble(data[2]);
            String vesselType = data[3];

            Vessel vessel = new Vessel(vesselId, vesselName,averageSpeed, vesselType);
            
            util.addVesselPerformance(vessel);
            
            
		}
		
		System.out.println("Enter the Vessel Id to get Vessel Details");
        String searchId = sc.nextLine();
        
        Vessel foundVessel = util.getVesselById(searchId); 

        if (foundVessel != null) {
            System.out.println(
                foundVessel.getVesselId() + " | " +
                foundVessel.getVesselName() + " | " +
                foundVessel.getVesselType() + " | " +
                foundVessel.getAverageSpeed() + " knots");
        }else {
        	System.out.println("Vessel Not Found");
        }
        
        System.out.println("High performance vessels are");
        for (Vessel v : util.getHighPerformanceVessels()) {
        	System.out.println(
                    v.getVesselId() + " | " +
                    v.getVesselName() + " | " +
                    v.getVesselType() + " | " +
                    v.getAverageSpeed() + " knots");
        }
	}

}
