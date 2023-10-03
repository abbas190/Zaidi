import java.util.ArrayList;
class Student {
    private static int id = 0;

    private String name;
    private int studentId;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.studentId = id++;
        this.courses = new ArrayList<>();
System.out.println("Student id: " + studentId + " Name: " + name);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public double averageGrade() {
        int total = 0;
        for (Course course : courses) {
            total += course.grade;

        }
        return (double) total / courses.size();
    }
    public void printer() {
        for (Course course : courses)
            System.out.println(course);
    }



    }






