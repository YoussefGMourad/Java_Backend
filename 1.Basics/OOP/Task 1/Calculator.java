public class Calculator {
    int num1;
    int num2;


    public void summation(int num1 , int num2){
        System.out.println(num1+ "+"+ num2 + "=" + (num1+ num2));
    }
    public void multiplication (int num1 , int num2){
        System.out.println(num1+ "*"+ num2 + "=" + (num1 * num2));

    }
    public void subtraction (int num1 , int num2){
        if(num2>num1){
            System.out.println(num1+ "-"+ num2 + "=" + (num2-num1));
        }else
            System.out.println(num1+ "-"+ num2 + "=" + (num1 - num2));

    }
}
