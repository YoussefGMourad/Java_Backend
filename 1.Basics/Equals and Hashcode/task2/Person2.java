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


    // based on the Id only
    // the output

    //The size of the set is 6
    //[Person{name='Yousef', id=1}, Person{name='Ahmed', id=2}, Person{name='Eslam', id=4},
    // Person{name='Micheal', id=6}, Person{name='Joe', id=8}, Person{name='Ali', id=9}]


//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Person2 person2 = (Person2) o;
//        return id == person2.id;
//        //&& Objects.equals(name, person2.name)
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id); //name
//    }




    // based on the name only
    // the output

//    The size of the set is 10
//    [Person{name='Ahmed', id=2}, Person{name='Yousef', id=1},
//    Person{name='Galal', id=1},Person{name='Mina', id=1},
//    Person{name='Eslam', id=4},Person{name='Ziad', id=1}
//    ,Person{name='Omar', id=1},Person{name='Ali', id=9}
//    ,Person{name='Joe', id=8},  Person{name='Micheal', id=6}]



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return  Objects.equals(name, person2.name);
        //id == person2.id &&
    }

    @Override
    public int hashCode() {
        return Objects.hash(name); //,id
    }
}