package task14;

public class Student {

    private final int studentID;
    private final String studentName;
    private final Email studentEmail;

    public Student(int studentID, String studentName, Email studentEmail) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public Email getStudentEmail() {
        return studentEmail;
    }

    public void showStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        studentEmail.showMailDetails();
    }
}
