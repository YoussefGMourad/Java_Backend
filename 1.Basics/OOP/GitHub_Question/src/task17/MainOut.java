package task17;

import task17.PackOne.Student;
import task17.PackTwo.Teacher;

public class MainOut {
    public static void main(String[] args) {
        Student std = new Student();
        std.setStudentName("Ahmed");
        std.setStudentId(2);
        //std.setStudentGrade(1);
// the Grade give an error because the access modifier is default
       // System.out.println("The Student Grade is: "+ std.getStudentGrade());
        System.out.println("The Student Name is: "+std.getStudentName());
        System.out.println("The Student ID is: "+std.getStudentId());


        System.out.println("----Teacher----");

        Teacher teacher =new Teacher();
        teacher.setTeacherName("Joe");
        teacher.setTeacherId(12);
        //teacher.setActive(true);

// the Active give an error because the access modifier is default
       // System.out.println("The Teacher Active status  is: "+ teacher.isActive());
        System.out.println("The Teacher Name is: "+teacher.getTeacherName());
        System.out.println("The Teacher ID is: "+teacher.getTeacherId());


    }
}