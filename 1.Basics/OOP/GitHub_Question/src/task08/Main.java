package task08;

public class Main {
    public static void main(String[] args) {

        SocialMediaApp app1  = new Facebook();
         app1.post(1,"Hello world","image.01");
        System.out.println("\n");
         SocialMediaApp app2 = new LinkedIn();
         app2.post(1,"Open to work","image.02");
    }
}