public class Student extends ShareData {
    private int age;

    public void setAge(int age) {
        if (age>7 && age <30){
            this.age = age;
        }else{
            throw new IllegalArgumentException("Error");
        }
    }

    public int getAge() {
        return age;
    }
}
