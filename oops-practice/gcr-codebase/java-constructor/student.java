class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }
}
class PostgraduateStudent extends Student {

    public void displayDetails() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCGPA());
    }
}
