package task15;

public class Main15 {
    public static void main(String[] args) {

        Course crs = new Course(1,"Math");

        Student std = new Student(1, crs, "Youssef");

        std.showStudentDetails();
    }
}