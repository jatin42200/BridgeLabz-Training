package SmartVehicleDashboard;

public class ElectricCar implements Vehicle{
	public void displaySpeed() {
        System.out.println("Electric Car speed: 90 km/h");
    }

    public void displayBatteryStatus() {
        System.out.println("Battery level: 75%");
    }
}
