class ClubFcPlayer extends Player {
    private String fCode;

    public ClubFcPlayer(int id, String name, int number, String fCode) {
        super(id, name, number);
        this.fCode = fCode;
    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Number: " + number +
                ", Fcode: " + fCode);
    }
}