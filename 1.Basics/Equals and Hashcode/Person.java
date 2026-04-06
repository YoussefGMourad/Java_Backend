import java.util.Objects;

public class Person {
   private  String name ;
   private int id;


   Person(int id ,String name){

       this.id = id;
       this.name = name;
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
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

}