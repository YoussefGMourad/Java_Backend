package task11;

public  abstract  class OrderList {
    protected String orderName;
    protected float orderPrice;


    public void addOrder(String name , float price){
    orderName=name;
    orderPrice= price;
    String order = name +" "+price ;
        System.out.println("Order Added");

    }

    public abstract void showOrder();
}