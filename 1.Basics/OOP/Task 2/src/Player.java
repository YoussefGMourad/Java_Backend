public class Player {
    private int playerNumber;
    private String playerName;

    public void setPlayerName(String playerName) {
       if (playerName.length()>5){
           this.playerName = playerName;
         }
    else {
        throw new IllegalArgumentException("Wrong input");
       }


    }
    public void setPlayerNumber(int playerNumber) {
        if (playerNumber > 0){
            this.playerNumber = playerNumber;
        }
        else {
            throw new IllegalArgumentException("Wrong input");
        }
    }
    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

public void printPlayerInfo(){
    System.out.println("The player name is :"+getPlayerName());
    System.out.println("The player number is :"+getPlayerNumber());

}
}
