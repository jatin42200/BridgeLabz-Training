class VehicleRegistration {

    // instance variables
    String ownerName;
    String vehicleType;

    // class variable (same for all vehicles)
    public static double registrationFee = 1500.0;

    // constructor
    VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
 class Vehicle {
    public static void main(String[] args) {

        VehicleRegistration v1 = new VehicleRegistration("Rahul", "Car");
        VehicleRegistration v2 = new VehicleRegistration("Amit", "Bike");

        v1.displayVehicleDetails();
        System.out.println();

        // update registration fee for all vehicles
        VehicleRegistration.updateRegistrationFee(2000.0);

        v2.displayVehicleDetails();
    }
}
