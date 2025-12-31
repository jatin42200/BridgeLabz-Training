class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println(customerName + " | " + carModel +" | Days: " + rentalDays +" | Total Cost: ₹" + calculateTotalCost());
    }
}
 class Car {
    public static void main(String[] args) {

        CarRental rent = new CarRental("Jatin", "PubgBaali", 5);
        rent.display();
    }
}
