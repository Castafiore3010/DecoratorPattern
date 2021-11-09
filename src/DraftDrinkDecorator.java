public class DraftDrinkDecorator extends DrinkDecorator {

    public DraftDrinkDecorator(Drink decoratedDrink) {
        super(decoratedDrink);
    }


    public void serve() {
        decoratedDrink.serve();
        draftDrink(decoratedDrink);
    }


    private void draftDrink(Drink decoratedDrink) {
        System.out.println("CONTAINER: Draft");
    }
}
