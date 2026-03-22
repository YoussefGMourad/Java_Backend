package task13;

public class Player extends BaseEntity {

    private String playername;
    private Shirt shirt;

    public  void setPlayerName(String name){
        this.playername = name;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public String getPlayername() {
        return playername;
    }

    public Shirt getShirt() {
        return shirt;
    }
}