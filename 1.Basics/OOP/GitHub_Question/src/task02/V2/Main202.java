package task02.V2;

import java.util.Scanner;

public class Main202 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the teacher name : ");
        teacher.setName(input.next());
        System.out.println("Please enter the teacher id :");
        teacher.setId(input.nextLong());
        System.out.println("Please enter the teacher phone number :");
        teacher.setPhoneNumber(input.next());
        System.out.println("Please enter the teacher age :");
        teacher.setAge(input.nextFloat());
        System.out.println("Please enter the teacher Salary :");
        teacher.setSalary(input.nextFloat());

        System.out.println("_____________________________________________________");

        teacher.printTeacherInfo();

    }
}