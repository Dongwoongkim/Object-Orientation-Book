package chapter1;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Cashier cashier = new Cashier();
        Barista barista = new Barista();
        
        String order = customer.order();
        String orderedMenu = cashier.getReceivedOrder(order);
        String madeMenu = barista.makeOrder(orderedMenu);

        String receivedMadeOrder = cashier.getReceivedMadeOrder(madeMenu);
        customer.getReceivedCoffee(receivedMadeOrder);
    }
}
