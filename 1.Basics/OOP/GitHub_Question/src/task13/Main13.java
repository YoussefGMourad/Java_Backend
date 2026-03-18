package task13;

public class Main13 {
    public static void main(String[] args) {

        Player player = new Player();
        player.setId(1);
        player.setPlayerName("Youssef");


        Shirt shirt = new Shirt();
        shirt.setShirtNumber(12);
        shirt.setColor("white");

        player.setShirt(shirt);
        shirt.setPlayer(player);

        System.out.println("The player "+ player.getPlayername() + " and his Shirt number is "+shirt.getShirtNumber() );
        System.out.println("The player wears a "+ shirt.getColor() + " Shirt" );
    }
}