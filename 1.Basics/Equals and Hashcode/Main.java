public class Main {
    public static void main(String[] args) {

        Person p1 = new Person (1,"JOE");
        Person p2 = new Person (1,"JOE");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        if(p1.equals(p2)) {
            System.out.println("Equal values");
        } else{
            System.out.println("Not equal values");
        }
    }
}