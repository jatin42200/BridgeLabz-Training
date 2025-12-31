
class StudentDetail {

    String name;
    String rollNumber;
    double mark1, mark2, mark3;

    char calculateGrade() {
        double average = (mark1 + mark2 + mark3) / 3;

        if (average >= 75) {
            return 'A';
        } else if (average >= 60) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        System.out.println("Mark1: " + mark1);
        System.out.println("Mark2: " + mark2);
        System.out.println("Mark3: " + mark3);
        System.out.println("Grade " + calculateGrade());
    }
}
class Student
{
public static void main(String[] args) {

        StudentDetail s1 = new StudentDetail();
        s1.name = "Thamarai";
        s1.rollNumber = "ECE001";
        s1.mark1 = 80.0;
        s1.mark2 = 70.0;
        s1.mark3 = 75.0;
        s1.displayDetails();

        StudentDetail s2 = new StudentDetail();
        s2.name = "Kannan";
        s2.rollNumber = "CSC002";
        s2.mark1 = 60.0;
        s2.mark2 = 65.0;
        s2.mark3 = 50.0;
        s2.displayDetails();
    }
}

    


