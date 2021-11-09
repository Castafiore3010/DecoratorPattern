public class ThrowDrinkDecorator extends DrinkDecorator {

    public ThrowDrinkDecorator(Drink decoratedDrink) {super(decoratedDrink);}


    @Override
    public void throwDrink() {
        decoratedDrink.throwDrink();
        withPower(decoratedDrink);

    }

    private void withPower(Drink decoratedDrink) {
        System.out.println("WITH POWER");
    }
}
