package task17.PackOne;

public class Student {
   private int studentId ;
   private String studentName;
   int grade;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

     void setStudentGrade(int grade) {
        this.grade = grade;
    }

    public void setStudentName(String studentName){
        this.studentName= studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

     int getStudentGrade() {
        return grade;
    }

    public void printStudentInfo(){
        System.out.println("The student name is :"+ getStudentName());
        System.out.println("The student ID is :"+getStudentId());
        System.out.println("The student Grade is :"+getStudentGrade());
    }
}