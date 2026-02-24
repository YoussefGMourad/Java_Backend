import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Teacher {
    private Long id; // id > 0
    private String name; // size >=3 and all digits char(a-z)
    private float age; // age >= 25 and age <= 60
    private String phoneNumber; //  +20111390660 13 cher and start with +20
    private float salary;  // salary >= 3000

    public void setId(Long id){
        if (id> 0){
            this.id =id;
        }else {
            throw new IllegalArgumentException("Wrong input");

        }
    }
    public void setName(String name){
        if (name.length() >= 3 && name.matches("[a-zA-Z]+")){
            this.name =name;
        }else {
            throw new IllegalArgumentException("Wrong input");

        }
    }

    public void setAge(float age) {
        if(age>=25 && age<=60){
            this.age=age;
        }else {
            throw new IllegalArgumentException("Wrong input");

        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.startsWith("+20") && phoneNumber.length()==13){
            this.phoneNumber = phoneNumber;
        }else {
            throw new IllegalArgumentException("Wrong input");

        }
    }
        public void setSalary(float salary){
           if (salary>=3000){
               this.salary=salary;
           }else {
               throw new IllegalArgumentException("Wrong input");
           }
        }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void printTeacherInfo(){
        System.out.println("The teacher name is"+ getName());
        System.out.println("The teacher Id is"+ getId());
        System.out.println("The teacher Phone number is"+ getPhoneNumber());
        System.out.println("The teacher age is"+ getAge());
        System.out.println("The teacher salary is"+ getSalary());
    }
}

