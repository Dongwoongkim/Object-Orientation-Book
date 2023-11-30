package chapter2.order;

public class Order {

    private final String menu;
    private final int quantity;
    private boolean isCompleted;

    public Order(String menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
        this.isCompleted = true;
    }

    public static Order createOrder(String menuAndQuantity) {
        String[] splitMenuAndQuantity = menuAndQuantity.split("-");
        return new Order(splitMenuAndQuantity[0], Integer.valueOf(splitMenuAndQuantity[1]));
    }

    public boolean sendFeedback() {
        if (isCompleted) {
            return true;
        }
        return false;
    }
}

