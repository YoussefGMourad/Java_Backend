package task2;

import java.util.Objects;

public class Person2 {
    private  String name ;
    private int id;


    Person2(int id , String name){
        this.name = name;
        this.id = id;
    };

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return id == person2.id;
        //&& Objects.equals(name, person2.name)
    }

    @Override
    public int hashCode() {
        return Objects.hash(id); //name
    }
}