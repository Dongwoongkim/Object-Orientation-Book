package chapter2.weirdCountry;

public class Drink {

    private Integer amount;

    public Drink(Integer amount) {
        this.amount = amount;
    }

    public void decrease(Integer amount) {
        this.amount -= amount;
    }

    public boolean isRemainAmount() {
        if (amount >= 10) {
            return true;
        }
        return false;
    }
}
