package task10;

public class ShowStudent extends  School {


    @Override
    public void showStudend(String name) {
        System.out.println("You are in Showstudent Class");
        System.out.println("Students: " + name);
    }
}