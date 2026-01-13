import java.util.ArrayList;
import java.util.List;

// 1. Custom Exception
class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException(String message) {
        super(message);
    }
}

// 2. Abstraction: Registration Service
abstract class RegistrationService {
    abstract void enroll(Student student, String courseName) throws CourseLimitExceededException;
}

// 3. Inheritance: Person (Parent) -> Student (Child)
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// 4. Encapsulation: Private fields and public getters/setters
class Student extends Person {
    private List<String> enrolledCourses;
    private String grade;

    public Student(String name, int id) {
        super(name, id);
        this.enrolledCourses = new ArrayList<>();
        this.grade = "Not Assigned";
    }

    public List<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}

// 5. Implementation of Abstraction
class EnrollmentManager extends RegistrationService {
    private static final int MAX_COURSES = 2;

    @Override
    void enroll(Student student, String courseName) throws CourseLimitExceededException {
        if (student.getEnrolledCourses().size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Limit reached! Student " + student.getName() + " cannot enroll in more than " + MAX_COURSES + " courses.");
        }
        student.getEnrolledCourses().add(courseName);
        System.out.println("Successfully enrolled " + student.getName() + " in " + courseName);
    }
}

// 6. Main Class
public class CourseSystem {
    public static void main(String[] args) {
        System.out.println("--- Student Management System ---\n");

        // Object Creation
        Student s1 = new Student("Rahul Kumar", 101);
        EnrollmentManager manager = new EnrollmentManager();

        try {
            // Course Enrollment
            manager.enroll(s1, "Java Programming");
            manager.enroll(s1, "Data Structures");
            
            // This will trigger the Exception (Limit is 2)
            manager.enroll(s1, "Web Development");

        } catch (CourseLimitExceededException e) {
            System.err.println("ALERT: " + e.getMessage());
        }

        // Grade Management
        s1.setGrade("A+");
        
        // Final Output
        System.out.println("\n--- Student Report ---");
        System.out.println("Student: " + s1.getName());
        System.out.println("Courses: " + s1.getEnrolledCourses());
        System.out.println("Final Grade: " + s1.getGrade());
    }
}