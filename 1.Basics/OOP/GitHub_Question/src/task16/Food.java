package task16;


public class Food {
    private  final  String foodName;
    private  final double foodPrice;

    public Food(String foodnName, double foodPrice){
        this.foodName=foodnName;
        this.foodPrice=foodPrice;
    }

    public String getFoodName(){
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void showFoodData(){
        System.out.println(foodName);
        System.out.println(foodPrice);
    }
}