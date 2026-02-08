package SmartVehicleDashboard;

public class DashboardApp {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
        Vehicle v2 = new ElectricCar();

        v1.displaySpeed();
        v1.displayBatteryStatus();

        v2.displaySpeed();
        v2.displayBatteryStatus();

	}

}
