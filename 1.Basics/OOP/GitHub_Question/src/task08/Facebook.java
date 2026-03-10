package task08;

public class Facebook  implements  SocialMediaApp{
    private  String appName = "Facebook";

    public void post(int id, String text, String imageURL){
        System.out.println("You are on the "+ appName + " application\n" +
                "Post ID: "+ id+  " | Text :"+ text +  " | Image: "+ imageURL );

    }
}