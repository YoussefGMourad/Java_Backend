package task16;

public class Person {

      private final String personName;
      private  final int personId;


      public  Person(int personId, String personName){
          this.personId= personId;
          this.personName= personName;
      }

    public String getPersonName() {
        return personName;
    }

    public int getPersonId() {
        return personId;
    }

    public void showPersonData(){

          System.out.println(personName);
          System.out.println(personId);
      }

}