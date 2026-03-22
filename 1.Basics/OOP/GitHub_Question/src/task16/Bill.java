package task16;

public class Bill {
   private final Order order;
   private final Gift gift ;

    public Bill(Order order, Gift gift) {
        this.order = order;
        this.gift = gift;
    }

    public Order getOrder() {
        return order;
    }

    public Gift getGift() {
        return gift;
    }

    public void showBill(){
    System.out.println("--- Bill ---");
        order.showOrder();

    double total = 0;
    for (Food food : order.getFoodList()) {
        total += food.getFoodPrice();
    }
    System.out.println("Total: " + total);
    if(getGift()!= null){
        gift.showGiftData();  // ← prints name and type correctly);
    }
    else
    {
        System.out.println("This bill doesn't  contian a Gift ");
    }
}



}