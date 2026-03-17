package task11;

public class Controller extends OrderList {

    @Override
    public void showOrder() {
        System.out.println("Your order is : " + orderName+" for "+orderPrice);
    }
}