package chapter2.order;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        String orderedMenu = customer.makeOrder("salad", 1);

        Order order = Order.createOrder(orderedMenu);
        customer.receiveFeedback(order.sendFeedback());
    }
}
