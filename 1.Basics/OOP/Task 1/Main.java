public class Main {

     static void main(String[] args) {

        // task one
         Student Std1 = new Student();
         Std1.print(1,"Youssef",24);

         System.out.println("-------------------------------------");

        // task two First Problem in the sheet
        Greetings name = new Greetings();
        name.print("programmer");

        System.out.println("-------------------------------------");
        // Problem two in the sheet
        Datatype obj = new Datatype();
        obj.print(1,13222223267L,'h', 334.23F,12.12321);

         System.out.println("-------------------------------------");

         // Problem three in the sheet

         Calculator Cal = new Calculator();
        Cal.summation(1,2);
        Cal.subtraction(2,9);
        Cal.multiplication(2,2);

        System.out.println("-------------------------------------");
        // Problem four in the sheet
        Difference equ = new Difference();
        equ.Calculation(12,1,32,9);

        System.out.println("-------------------------------------");

        // Problem five in the sheet
         CircleArea circle1 = new CircleArea();

         circle1.area(2);
     }
}
