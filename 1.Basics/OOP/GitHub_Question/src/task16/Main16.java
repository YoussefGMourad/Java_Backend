package task16;

import java.util.ArrayList;
import java.util.List;

public class Main16 {
    public static void main(String[] args) {
        Food f1 = new Food("Pasta", 12.99);
        Food f2 = new Food("Pizza", 15.99);
        Person person = new Person(1, "Youssef");
        List<Food> foods = new ArrayList<>();
        foods.add(f1);
        foods.add(f2);
        Order order = new Order(person, foods);
        Gift gift = new Gift("Free Dessert", "Food");
        Bill bill = new Bill(order, gift);
        bill.showBill();
    }
}