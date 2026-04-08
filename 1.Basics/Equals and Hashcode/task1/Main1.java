package task1;

import java.util.HashSet;

public class Main1 {
    public static void main(String[] args) {


        Person p1 = new Person(1,"JOE");

        Person p2 = new Person(1,"JOE");

        System.out.println(p1.toString());
        System.out.println(p2.toString());


        // System.out.println(p1.equals(p2));

        if(p1.equals(p2))  {                 // true
            System.out.println("Equal values");
        } else{                              // false
            System.out.println("Not equal values");
        }


        if(p1==p2)  {
            System.out.println("Equal values");
        } else{                              // false
            System.out.println("Not equal values");
        }
        // before overriding the Equals method the two objects aren't equal because it uses references
        // but after overriding the Equals method the two objects are equal in values

        System.out.println("<------------------Hashset----------------------->");

        HashSet<Person> set  = new HashSet<>();
        set.add(p1);
        set.add(p2);
        System.out.println("The size of the set is : "+set.size()); // will  return one if the Hashcode is overrided
        System.out.println(set);

    }
}