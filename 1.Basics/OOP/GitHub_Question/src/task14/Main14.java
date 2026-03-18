package task14;

import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        int id =0;
        String TO;
        String text ;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ID:");
        id = Integer.parseInt(input.nextLine());  // parse after reading full line

        System.out.println("Enter TO:");
        TO = input.nextLine();

        System.out.println("Enter text:");
        text = input.nextLine();


        Email mail = new Email(id,TO,"test",text); // object emial
        Student std = new Student(1,"youssef",mail);

       std.showStudentDetails();

    }
}