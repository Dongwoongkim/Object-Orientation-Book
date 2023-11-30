package chapter2.order;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String makeOrder(String product, int quantity) {
        return product + "-" + quantity;
    }

    public void receiveFeedback(boolean isComplete) {
        if (isComplete) {
            System.out.println("주문완료");
        }
    }
}
