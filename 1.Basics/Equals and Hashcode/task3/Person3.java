package task3;

import java.util.Objects;

public class Person3 {
        private  String name ;
        private int id;


        public Person3(int id, String name){
            this.name = name;
            this.id = id;
        };

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person3 {" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person3 = (Person3) o;
        return id == person3.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
