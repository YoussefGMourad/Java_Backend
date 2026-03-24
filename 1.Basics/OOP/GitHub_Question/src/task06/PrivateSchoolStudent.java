package task06;

public class PrivateSchoolStudent extends Student {

        public PrivateSchoolStudent(int id, String name) {
            super(id, name);
        }

        @Override
        public void printInfo() {
            System.out.println("Private School Student -> ID: " + getId() + ", Name: " + getName());
        }
    }

