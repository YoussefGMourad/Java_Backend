public class publicSchoolStudent extends Studentp6  {
    public publicSchoolStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public void printInfo() {
        System.out.println("Public School Student -> ID: " + getId() + ", Name: " + getName());
    }
}

