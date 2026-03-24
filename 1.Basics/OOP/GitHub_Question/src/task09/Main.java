package task09;

public class Main {
    public static void main(String[] args) {
        System.out.println("Public Club");
        PublicClub player = new PublicClub();
        player.age = 10;
        player.name ="Youssef";
        player.Position = "Goalkeeper";
        player.getAge();
        player.getName();
        player.getposition();

        System.out.println("\n");
    PrivateClub player2 = new PrivateClub();
        player2.setAge(23);
        player2.setName("Ahmed");
        player2.setPosition("Forward");

        System.out.println("the task04.Player name is : "+player2.getName());
        System.out.println("the task04.Player age is : "+player2.getAge());
        System.out.println("the task04.Player Position is : "+player2.getPosition());


    }
}