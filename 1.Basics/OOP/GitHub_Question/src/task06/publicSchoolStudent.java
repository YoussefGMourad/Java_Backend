package task06;

public class publicSchoolStudent extends Student {
    public publicSchoolStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public void printInfo() {
        System.out.println("Public School Student -> ID: " + getId() + ", Name: " + getName());
    }
}

