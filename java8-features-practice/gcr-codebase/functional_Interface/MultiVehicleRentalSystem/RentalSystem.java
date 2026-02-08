package MultiVehicleRentalSystem;

public class RentalSystem {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        Vehicle v3 = new Bus();

        v1.rent();
        v1.returnVehicle();

        v2.rent();
        v2.returnVehicle();

        v3.rent();
        v3.returnVehicle();

	}

}
