package task13;

public class Shirt extends BaseEntity {
    private int shirtNumber;
    private String color;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }
}