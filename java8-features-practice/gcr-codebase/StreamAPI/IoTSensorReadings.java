import java.util.Arrays;
import java.util.List;

public class IoTSensorReadings {

	public static void main(String[] args) {
		List<Double> sensorReadings = Arrays.asList(18.5, 22.3, 30.1, 25.0);

	    double threshold = 20.0;

	    sensorReadings.stream().filter(reading -> reading > threshold).forEach(reading ->
	                    System.out.println("High Reading: " + reading));

	}

}
