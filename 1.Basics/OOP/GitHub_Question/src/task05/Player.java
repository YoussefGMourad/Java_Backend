package task05;

public class Player extends ShareData {
    private int number;

    public void setNumber(int number) {
        if (number > 2) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }

    public int getNumber() {
        return number;
    }

    public void printPlayerInfo() {
        System.out.println("name :" + getName());
        System.out.println("ID :" + getId());
        System.out.println("number :" + getNumber());
        System.out.println("Phone :" + getPhone());
    }
}