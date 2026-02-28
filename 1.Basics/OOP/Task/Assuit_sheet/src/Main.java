import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        //Problem F
        int sum =0;
//        int digit =0;
//        System.out.println("Please enter the first number");
//        int num1 = input.nextInt();
//        System.out.println("Please enter the sec number");
//        int num2 = input.nextInt();
//
//        if (num1 ==0 ||num1<0){
//         sum= num2 % 10;
//            System.out.println("The sum is :"+sum);
//        } else if (num2==0 || num2<0) {
//            sum= num1 % 10;
//            System.out.println("The sum is :"+sum);
//        }else{
//            sum= num2 % 10;
//           sum=sum+(num1%10);
//            System.out.println("The sum is :"+sum);
//        }
        // Problem G
//        int N = 0;
//        sum =0; // using the same var in the last problem
//        System.out.println("Please enter a number");
//        N = input.nextInt();
//        for (int i =1;i<=N;i++)
//        {
//            sum=i+N;
//
//        }
//        System.out.println("the sum is : "+ sum);


        // problem H
        float number1 , number2;
//        System.out.println("enter the first number");
//        number1 = input.nextFloat();
//
//        System.out.println("enter the first number");
//        number2 = input.nextFloat();
//
//        float res = number1/number2;
//
//        System.out.println(Math.floor(res));
//        System.out.println(Math.ceil(res));
//        System.out.println(Math.round(res));

        //Problem I
        int N1,N2;
//        System.out.println("Please enter number 1");
//        N1=input.nextInt();
//        System.out.println("Please enter number 2");
//        N2=input.nextInt();
//        if (N1>=N2){
//
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }



      // Problem J

//        System.out.println("Please enter number 1");
//        N1=input.nextInt();
//        System.out.println("Please enter number 2");
//        N2=input.nextInt();
//
//        if(N1%N2 ==0 || N2%N1==0){
//            System.out.println("Multiples");
//        }else {
//            System.out.println("Not Multiples");
//        }


// Problem K
//        int Num1,Num2,Num3;
//        System.out.println("Please enter number 1");
//        Num1=input.nextInt();
//        System.out.println("Please enter number 2");
//
//
//        Num2=input.nextInt();
//        System.out.println("Please enter number 3");
//        Num3=input.nextInt();
//
//        int min = Math.min(Num1, Math.min(Num2, Num3));
//        int max = Math.max(Num1, Math.max(Num2, Num3));
//
//        System.out.println(min + " " + max);

        //Problem L
      /*  String F1 = input.next();
        String S1 = input.next();

        String F2 = input.next();
        String S2 = input.next();

        if (S1.equals(S2)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }*/

//Problem M
//        char X;
//        System.out.println("enter a digit or an letter");
//        X = input.next().charAt(0);

//        if (X >= '0' && X <= '9') {
//            System.out.println("IS DIGIT");
//        } else {
//            System.out.println("ALPHA");
//
//            if (X >= 'A' && X <= 'Z') {
//                System.out.println("IS CAPITAL");
//            } else {
//                System.out.println("IS SMALL");
//            }



        // Problem N



//        if (Character.isLowerCase(X)) {
//            X = Character.toUpperCase(X);
//        } else {
//            X = Character.toLowerCase(X);
//        }


        //Problem O

        System.out.println("Enter a number ");
        int A = input.nextInt();
        System.out.println("Enter an Opertaion  ");
        char op = input.next().charAt(0);
        System.out.println("Enter a number ");
        int B = input.nextInt();


        int result = 0;

        switch (op) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B; // integer division
                break;
        }

        System.out.println(result);




        input.close();
    }


}