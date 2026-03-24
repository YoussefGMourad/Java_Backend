package task17.PackTwo;

public class Main17p2 {
    public static void main(String[] args) {

        Teacher teacher =new Teacher();
        teacher.setTeacherName("Joe");
        teacher.setTeacherId(12);
        teacher.setActive(true);

        System.out.println("The Teacher Grade is: "+ teacher.isActive());
        System.out.println("The Teacher Name is: "+teacher.getTeacherName());
        System.out.println("The Teacher ID is: "+teacher.getTeacherId());
    }
}