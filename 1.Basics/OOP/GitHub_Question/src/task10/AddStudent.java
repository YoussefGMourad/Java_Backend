package task10;

public class AddStudent extends School  {

    @Override
        public void addStudent(String name) {
            System.out.println("You are in addstudent Class");
            System.out.println("Student added: " + name);
    }

}