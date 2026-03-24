class ClubRelPlayer extends Player {
    private String rCode;

    public ClubRelPlayer(int id, String name, int number, String rCode) {
        super(id, name, number);
        this.rCode = rCode;
    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Number: " + number +
                ", Rcode: " + rCode);
    }
}