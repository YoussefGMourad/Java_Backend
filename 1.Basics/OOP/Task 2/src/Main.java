import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player= new Player();

         Scanner input = new Scanner(System.in);




        //        problem number 2 V 2.1

        System.out.println("Please enter the player name :");
        player.setPlayerName(input.next());
        System.out.println("Please enter the player number :");
        player.setPlayerNumber(input.nextInt());

        player.printPlayerInfo();

        System.out.println("_____________________________________________________");

    //problem number 2 V 2.2

        Teacher teacher = new Teacher();
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

        // Problem number 3
        System.out.println("_____________________________________________________");

        Calculation equ = new Calculation();
        System.out.println("Enter the first number :");
        equ.setNumberone(input.nextFloat());

        System.out.println("Enter the second number :");
        equ.setNumbertwo(input.nextFloat());

        System.out.println("Enter the third number :");
        equ.setNumberthree(input.nextFloat());

        System.out.println("_____________________________________________________");
        equ.printTheSum();


        System.out.println("_____________________________________________________");





    }




}