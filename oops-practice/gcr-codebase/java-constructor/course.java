class CourseManagement {

    // instance variables
    String courseName;
    int duration; // in months
    double fee;

    // class variable
    public static String instituteName = "ABC Institute";

    // constructor
    CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
 class Course {
    public static void main(String[] args) {

        CourseManagement c1 = new CourseManagement("Java Full Stack", 6, 45000);
        CourseManagement c2 = new CourseManagement("Data Structures", 4, 30000);

        c1.displayCourseDetails();
        System.out.println();

        // update institute name (affects all objects)
        CourseManagement.updateInstituteName("BridgeLabz");

        c2.displayCourseDetails();
    }
}
