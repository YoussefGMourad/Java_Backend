public class PrivateSchoolStudent extends Studentp6 {

        public PrivateSchoolStudent(int id, String name) {
            super(id, name);
        }

        @Override
        public void printInfo() {
            System.out.println("Private School Student -> ID: " + getId() + ", Name: " + getName());
        }
    }

