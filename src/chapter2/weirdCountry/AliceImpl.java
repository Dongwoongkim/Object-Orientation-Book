package chapter2.weirdCountry;

public class AliceImpl implements Alice {

    private Integer height;
    private Integer position;
    private Drink drink;

    public AliceImpl() {
        this.height = 130;
        this.position = 0;
        this.drink = new Drink(100);
    }

    @Override
    public void drink() {
        if (drink.isRemainAmount()) {
            drink.decrease(10);
            this.height -= 100;
        }
    }

    @Override
    public void eatCake() {
        this.height += 150;
    }

    @Override
    public void fan() {
        this.height -= 20;
    }

    @Override
    public void eatMushroom(String part) {
        if (part.equals("left")) {
            this.height += 10;
        }
        this.height -= 10;
    }

    @Override
    public void passDoor() {
        if (this.height < 40) {
            this.position = 1;
        }
    }

    @Override
    public void showHeight() {
        System.out.println(this.height);
    }

    @Override
    public void showPosition() {
        System.out.println(this.position);
    }
}
