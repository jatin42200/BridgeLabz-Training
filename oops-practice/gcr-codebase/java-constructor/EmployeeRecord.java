class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee {

    void displayDetails() {
        System.out.println(employeeID);
        System.out.println(department);
    }
}
