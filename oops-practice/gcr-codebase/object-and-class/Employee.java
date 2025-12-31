
public class Employee {

    // Attributes
    String name;
    int id;
    double salary;

    //  Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    // main method
    public static void main(String[] args) {

        // create an object
        Employee emp = new Employee();

        //here we initialize value
        emp.name = "Rohan";
        emp.id = 1;
        emp.salary = 500000;

        // method calling
        emp.displayDetails();
    }
}