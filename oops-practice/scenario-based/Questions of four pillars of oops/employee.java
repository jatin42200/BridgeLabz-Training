
abstract class Employee {
    private final String name;
    private final double salary;
    protected final double bonus; // cached bonus

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = calculateBonus(); // bonus ek hi baar calculate
    }

    protected double getSalary() {
        return salary;
    }

    protected abstract double calculateBonus();

    public double getBonus() {
        return bonus;
    }
}

// Manager class
class Manager extends Employee {

    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus() {
        return getSalary() * 0.10;
    }
}

// Developer class
class Developer extends Employee {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    protected double calculateBonus() {
        if (getSalary() > 50000) {
            return getSalary() * 0.05;
        }
        return 0.0;
    }
}

// Main class
public class employee {
    public static void main(String[] args) {

        Employee manager = new Manager("Jatin", 80000);
       System.out.println(manager.getBonus()); //output:- 8000.00

        Employee dev1 = new Developer("Goldy", 60000);
        System.out.println( dev1.getBonus()); //output:- 3000.00

        Employee dev2 = new Developer("John", 40000);
        System.out.println( dev2.getBonus()); //output:- 0.00
    }
}