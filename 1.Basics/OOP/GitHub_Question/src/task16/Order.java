package task16;

import java.util.List;

public class Order {

    private final Person person;

    private final  List<Food> foodList;

    public Order (Person person , List<Food> foodList){
        this.person =person;
        this.foodList=foodList;

    }

    public Person getPerson() {
        return person;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void showOrder(){

        System.out.println(person.getPersonName());

        for(Food food:foodList){
            food.showFoodData();
        }
}

}