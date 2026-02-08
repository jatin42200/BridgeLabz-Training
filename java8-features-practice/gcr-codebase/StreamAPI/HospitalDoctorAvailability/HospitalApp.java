package HospitalDoctorAvailability;

import java.util.*;
import java.util.stream.*;

public class HospitalApp {

	public static void main(String[] args) {
		List<Doctor> doctors = Arrays.asList(
	            new Doctor("Dr. Sharma", "Cardiology", true),
	            new Doctor("Dr. Mehta", "Neurology", false),
	            new Doctor("Dr. Khan", "Orthopedics", true),
	            new Doctor("Dr. Singh", "Dermatology", true),
	            new Doctor("Dr. Rao", "Cardiology", false)
	    );
		
		List<Doctor> result = doctors.stream().filter(d -> d.isAvailableOnWeekend())
				.sorted(Comparator.comparing(Doctor::getSpecialty)).collect(Collectors.toList());
		
		result.forEach(d -> System.out.println(d.getName() + " | " + d.getSpecialty()));

	}

}
