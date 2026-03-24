package task05;

public class BaseEntity {
    private String Name;
    private int id  ;


    public void setName(String Name){
        if(Name.length()>=5){
            this.Name = Name;
        }else {
            throw new IllegalArgumentException("This name is not valid");
        }
    }
    public void setId(int id){
        if(id>0){
            this.id = id;
        }else {
            throw new IllegalArgumentException("This ID is not valid");
        }
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return Name;
    }
}


