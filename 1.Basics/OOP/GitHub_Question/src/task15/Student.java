package task15;

public class Student {

    private int studentId;
    private String studentName;
    private Course course ;

    public Student(int studentId, Course course, String studentName) {
        this.studentId = studentId;
        this.course = course;
        this.studentName = studentName;
    }

    public Course getCourse() {
        return course;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void showStudentDetails(){
        System.out.println("The student id is: "+studentId);
        System.out.println("The stundet  name is: "+studentName);
        System.out.println("-------------------------------");
        course.showCourseDetails();
    }
}