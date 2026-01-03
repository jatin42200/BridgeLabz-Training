// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();
}

// ElectricVehicle subclass
class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging using electric power.");
    }
}

// PetrolVehicle subclass (Hybrid inheritance here)
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled with petrol.");
    }
}

// Main class
public class VehicleManagement {
    public static void main(String[] args) {

        Vehicle v1 = new ElectricVehicle("Tesla Model 3", 200);
        Vehicle v2 = new PetrolVehicle("Honda City", 180);

        v1.displayInfo();
        ((ElectricVehicle) v1).charge();
        System.out.println();

        v2.displayInfo();
        ((Refuelable) v2).refuel();
    }
}
