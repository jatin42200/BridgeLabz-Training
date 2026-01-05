
// Interface
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class
abstract class Employee implements Department {
    private int employeeId;
    private String name;
    protected double baseSalary;
    protected String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("----------------------");
    }

    // Interface methods
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    public String getDepartmentDetails() {
        return department;
    }
}

// Full-time employee
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Ravi", 80, 500);

        e1.assignDepartment("IT");
        e2.assignDepartment("HR");

        Employee[] employees = {e1, e2};

        for (Employee e : employees) {
            e.displayDetails();   // POLYMORPHISM
        }
    }
}
