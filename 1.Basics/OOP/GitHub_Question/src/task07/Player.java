package task07;

class Player {
    protected int id;
    protected String name;
    protected int number;

    public Player(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    // print basic info
    public void printInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Number: " + number);
    }
}