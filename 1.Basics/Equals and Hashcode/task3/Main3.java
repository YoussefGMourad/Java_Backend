package task3;


import java.util.HashMap;


public class Main3 {
    public static void main(String[] args) {
        HashMap<Person3,String> map  = new HashMap<>();
        Person3 p1 = new Person3(1,"Youssef");
        Person3 p2 = new Person3(1,"Youssef");
        p1.setId(2);
        map.put(p1,"Employee");
        map.put(p2,"Manager");
        map.get(p1);
        System.out.println(map);

    Person3 p3 = new Person3(1,"Youssef");
        System.out.println(map.get(p3));

    }
}