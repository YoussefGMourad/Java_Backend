public class Studentp6 {

    private  int id;
    private String name;

    public Studentp6(int id, String name) {
        this.id = id;
        this.name = name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setId(int id){
//        this.id= id;
//
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void printInfo (){
        System.out.println("Student name is : "+ getName());
        System.out.println("Student Id is : "+ getId());

    }
}
