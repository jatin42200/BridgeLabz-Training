
class Calculation {

  public double radius;

   public void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is : "+area);
    }

    public void calculateCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.printf("Circumference of circle: %.4f\n", circumference);
    }
}

class Area_of_Circle{
   public static void main(String[] args) {

        Calculation c = new  Calculation();
        c.radius = 2.5;

        c.calculateArea();
        c.calculateCircumference();
    }
}

   