import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FoodDelivery system =
                new FoodDelivery();

        Thread delivery = new Thread(new DeliveryPerson(system));

        Thread customer = new Thread(new Customer(system));

        delivery.start();
        customer.start();
    }
}


class FoodDelivery{
    ArrayList<Order>orders = new ArrayList<>();

    synchronized void addOrder(Order o){
        orders.add(o);
        notify();
    }

    synchronized Order processOrder() throws InterruptedException{
        while(orders.isEmpty()){
            wait();
        }
        return orders.remove(0);
    }
}

class Customer implements Runnable{
    FoodDelivery system;
    Customer(FoodDelivery system){
        this.system = system;
    }
    public void run(){
        try{
        for(int i=1;i<=5;i++){
        Order a = new Order("Cst" + i, i);
        system.addOrder(a);
        Thread.sleep(1000);
        }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

class DeliveryPerson implements Runnable{
    FoodDelivery system;
    DeliveryPerson(FoodDelivery system){
        this.system = system;
    }
    public void run(){
        try{
        while(true){
            Order o = system.processOrder();
            System.out.println("Processing order : "+ o);
            Thread.sleep(1000);

        }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

class Order{
    String cstname;
    int orderId;
    Order(String name, int id){
        this.cstname = name;
        this.orderId = id;
    }
}