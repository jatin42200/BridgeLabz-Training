import java.util.ArrayList;
import java.util.List;

// 1. Custom Exception
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

// 2. Interface for Strategy/Polymorphism
interface FareCalculator {
    double calculate(double distance);
}

// 3. Polymorphic Pricing Behaviors
class NormalPricing implements FareCalculator {
    public double calculate(double distance) {
        return distance * 10; // ₹10 per km
    }
}

class PeakPricing implements FareCalculator {
    public double calculate(double distance) {
        return distance * 20; // ₹20 per km (Double charges)
    }
}

// 4. OOP Models (User, Driver, Ride)
class User {
    String name;
    public User(String name) { this.name = name; }
}

class Driver {
    String name;
    boolean isAvailable;

    public Driver(String name) {
        this.name = name;
        this.isAvailable = true;
    }
}

class Ride {
    User user;
    Driver driver;
    double fare;

    public Ride(User user, Driver driver, double fare) {
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }

    public void showRideDetails() {
        System.out.println("Ride Confirmed! Passenger: " + user.name + 
                           " | Driver: " + driver.name + 
                           " | Total Fare: ₹" + fare);
    }
}

// 5. Booking Service
class CabService {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver d) { drivers.add(d); }

    public void bookRide(User user, double distance, boolean isPeakHour) throws NoDriverAvailableException {
        Driver availableDriver = null;
        for (Driver d : drivers) {
            if (d.isAvailable) {
                availableDriver = d;
                break;
            }
        }

        if (availableDriver == null) {
            throw new NoDriverAvailableException("Sorry " + user.name + ", all drivers are currently busy.");
        }

        // Polymorphism in action
        FareCalculator strategy = isPeakHour ? new PeakPricing() : new NormalPricing();
        double finalFare = strategy.calculate(distance);

        availableDriver.isAvailable = false; // Driver assigned
        Ride ride = new Ride(user, availableDriver, finalFare);
        ride.showRideDetails();
    }
}

// 6. Main Class
public class CabBookingSystem {
    public static void main(String[] args) {
        CabService uber = new CabService();
        
        // Setup Drivers
        uber.addDriver(new Driver("Rajesh"));
        uber.addDriver(new Driver("Suresh"));

        User u1 = new User("Amit");
        User u2 = new User("Priya");
        User u3 = new User("Rahul");

        System.out.println("--- Welcome to Cab Booking System ---\n");

        try {
            // Case 1: Normal Hour Booking
            System.out.println("Request 1: Amit booking for 10km (Normal Hour)");
            uber.bookRide(u1, 10, false);

            // Case 2: Peak Hour Booking (Price should be double)
            System.out.println("\nRequest 2: Priya booking for 10km (Peak Hour)");
            uber.bookRide(u2, 10, true);

            // Case 3: No Driver Available Exception
            System.out.println("\nRequest 3: Rahul booking (No drivers left)");
            uber.bookRide(u3, 5, false);

        } catch (NoDriverAvailableException e) {
            System.err.println("ALERT: " + e.getMessage());
        }

        System.out.println("\n--- System Service Ended ---");
    }
}