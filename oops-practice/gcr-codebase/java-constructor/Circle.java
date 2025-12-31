
class areaCircle {
    double radius;

    // Default constructor
    areaCircle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    areaCircle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
class Circle
{
    public static void main(String[]args)
    {
        areaCircle ac=new areaCircle(6.90);
        System.out.println(ac.area());
    }
}
