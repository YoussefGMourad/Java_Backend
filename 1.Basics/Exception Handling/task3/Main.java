package task3;
public class Main {

    public static String printUpperCase(String text){
        String upperCaseWord= text.toUpperCase();
        return upperCaseWord;
    }
    public static void main(String[] args) {
        System.out.println(printUpperCase("hello"));
        try {

            System.out.println(printUpperCase(null));
        }catch( NullPointerException e){
            System.out.println("Error: text is null " + e.getMessage());
        }
    }
}