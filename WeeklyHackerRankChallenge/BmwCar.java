class Car {

    int speed;
    int numberOfTyres;

    Car(int speed, int numberOfTyres) {
        this.speed = speed;
        this.numberOfTyres = numberOfTyres;
    }

    void accelerate() {
        speed = speed + 10;
        System.out.println("Car speed increased to: " + speed);
    }

    void speed() {
        System.out.println("Car speed is: " + speed);
    }
}


class BMW extends Car {

    BMW(int speed, int numberOfTyres) {
        super(speed, numberOfTyres);
    }

    @Override
    void accelerate() {
        speed = speed + 30;
        System.out.println("BMW speed increased to: " + speed);
    }

    @Override
    void speed() {
        System.out.println("BMW speed is: " + speed);
    }
}


public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW(100, 4);

        bmw.speed();
        bmw.accelerate();
        bmw.speed();
    }
}