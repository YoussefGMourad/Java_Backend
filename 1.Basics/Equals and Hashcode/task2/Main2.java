package task2;

import java.util.HashSet;

public class Main2 {
    public static void main(String[] args) {

        Person2 p1 = new Person2(1,"Yousef");
        Person2 p2 = new Person2(2,"Ahmed");
        Person2 p3 = new Person2(1,"Galal");
        Person2 p4 = new Person2(4,"Eslam");
        Person2 p5 = new Person2(1,"Ziad");
        Person2 p6 = new Person2(8,"Joe");
        Person2 p7 = new Person2(6,"Micheal");
        Person2 p8 = new Person2(1,"Mina");
        Person2 p9 = new Person2(9,"Ali");
        Person2 p10 = new Person2(1,"Omar");


        HashSet<Person2> set  = new HashSet<>();

            set.add(p1);
            set.add(p2);
            set.add(p3);
            set.add(p4);
            set.add(p5);
            set.add(p6);
            set.add(p7);
            set.add(p8);
            set.add(p9);
            set.add(p10);

        System.out.println("The size of the set is "+set.size());
        System.out.println(set);


    }
}
