package task12;

public class Post {
   private final int id;
   private final String text;
   private String image;



   public Post(int id , String text){
       this.id=id;
       this.text=text;

   }

    public Post( int id , String text ,String image ){
        this.id=id;
        this.text=text;
        this.image=image;
    }

    public int getId() {
        return id;
    }


    public String getImage() {
        return image;
    }


    public String getText() {
        return text;
    }

    public void print(){
        System.out.println("Post id : " +getId());
        System.out.println("Post text : " +getText());
        if (getImage()!= null) {
            System.out.println("Post image : " + getImage());
        }else System.out.println("this post doesn't contain an image");
    }
}