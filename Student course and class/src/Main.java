import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Math", 40);
        Course course2 = new Course("Physics", 84);
        Course course3 = new Course("Computer", 63);

        Student student1 = new Student("Abbas");
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);

        System.out.println(student1);
        student1.printer();

        System.out.println("Average Grade is " + student1.averageGrade());
    }
}






