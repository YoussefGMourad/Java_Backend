package task14;

public class Email {

   private final int id;
   private final String sentTo;
   private final String subject;
   private final String text;

    public Email(int id, String sentTo, String subject, String text) {
        this.id = id;
        this.sentTo = sentTo;
        this.subject = subject;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getSentTo() {
        return sentTo;
    }

    public String getSubject() {
        return subject;
    }

    public void showMailDetails(){
       System.out.println("ID: "+ getId());
       System.out.println("TO : "+ getSentTo());
       System.out.println("subject : "+ getSubject());
       System.out.println("Text : "+ getText());


   }

}