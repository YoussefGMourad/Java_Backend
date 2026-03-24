package task17.PackOne;

public class Main17p1 {
    public static void main(String[] args) {
        Student std = new Student();
        std.setStudentName("Youssef");
        std.setStudentId(1);
        std.setStudentGrade(3);

        System.out.println("The Student Grade is: "+ std.getStudentGrade());
        System.out.println("The Student Name is: "+std.getStudentName());
        System.out.println("The Student ID is: "+std.getStudentId());
    }
}