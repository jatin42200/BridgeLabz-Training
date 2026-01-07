import java.util.*;

// Custom Exception
class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String message) {
        super(message);
    }
}

// Interface for Polymorphism
interface FareCalculator {
    double calculate(double distance);
}

// Concrete Strategy: Normal Pricing
class NormalFare implements FareCalculator {
    public double calculate(double distance) { return distance * 10; }
}

// Concrete Strategy: Peak Pricing
class PeakFare implements FareCalculator {
    public double calculate(double distance) { return distance * 20; }
}

// OOP Classes
class User {
    String name;
    User(String name) { this.name = name; }
}

class Driver {
    String name;
    boolean isAvailable = true;
    Driver(String name) { this.name = name; }
}

class Ride {
    User user;
    Driver driver;
    double fare;

    void bookRide(User u, List<Driver> drivers, double distance, FareCalculator fareStrategy) 
            throws NoDriverAvailableException {
        this.user = u;
        // Finding first available driver
        this.driver = drivers.stream()
                .filter(d -> d.isAvailable)
                .findFirst()
                .orElseThrow(() -> new NoDriverAvailableException("Sorry " + u.name + ", no drivers nearby!"));

        this.driver.isAvailable = false;
        this.fare = fareStrategy.calculate(distance);
        
        System.out.println("Ride Booked! Driver: " + driver.name + " | Fare: ₹" + fare);
    }
}

public class CabSystem {
    public static void main(String[] args) {
        User user1 = new User("Rahul");
        List<Driver> drivers = Arrays.asList(new Driver("Amit"), new Driver("Sunil"));

        Ride ride = new Ride();
        try {
            // Polymorphism: Peak pricing used here
            ride.bookRide(user1, drivers, 10.5, new PeakFare());
        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
