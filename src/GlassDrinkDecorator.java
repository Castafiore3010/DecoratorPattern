public class GlassDrinkDecorator extends DrinkDecorator{

    public GlassDrinkDecorator(Drink decoratedDrink) {
        super(decoratedDrink);

    }

    public void serve() {
        decoratedDrink.serve();
        glassDrink(decoratedDrink);

    }


    private void glassDrink(Drink decoratedDrink) {
        System.out.println("CONTAINER: Glass");
    }

}
