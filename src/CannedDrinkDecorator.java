public class CannedDrinkDecorator extends DrinkDecorator {


    public CannedDrinkDecorator(Drink decoratedDrink) {
        super(decoratedDrink);
    }


    @Override
    public void serve() {
        decoratedDrink.serve();
        canDrink(decoratedDrink);
    }


    private void canDrink(Drink decoratedDrink) {
        System.out.println("CONTAINER: Can");
    }
}
