public abstract class DrinkDecorator implements Drink {
    protected Drink decoratedDrink;

    public DrinkDecorator(Drink decoratedDrink) {
        this.decoratedDrink = decoratedDrink;
    }

    public void serve() {
        decoratedDrink.serve();
    }

    public void throwDrink() {
        decoratedDrink.throwDrink();
    }

}
