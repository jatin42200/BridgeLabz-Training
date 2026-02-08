package OceanFleet;

import java.util.*;

public class VesselUtil {
	private List<Vessel> vesselList = new ArrayList<>();
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel vessel : vesselList) {
			if(vessel.getVesselId().equalsIgnoreCase(vesselId)) {
				return vessel;
			}
		}
		return null;
		
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		double max = Double.MIN_VALUE;
		for(Vessel vessel : vesselList) {
			if(vessel.getAverageSpeed()>max) {
				max = vessel.getAverageSpeed();
			}
		}
		
		List<Vessel> ans = new ArrayList<>();
		for(Vessel vessel : vesselList) {
			if(vessel.getAverageSpeed()==max) {
				ans.add(vessel);
			}
		}
		return ans;
	}
}
