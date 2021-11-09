public class PatternDemo {

    public static void main(String[] args) {

        // ARRANGEMENT
        Drink beer = new Beer();
        Drink beerBomb = new CannedDrinkDecorator(new ThrowDrinkDecorator(beer));
        Drink cannedBeer = new CannedDrinkDecorator(beer);
        Drink glassBeer = new GlassDrinkDecorator(beer);
        Drink draftBeer = new DraftDrinkDecorator(beer);

        Drink cider = new Cider();
        Drink cannedCider = new CannedDrinkDecorator(cider);
        Drink glassCider = new GlassDrinkDecorator(cider);
        Drink draftCider = new DraftDrinkDecorator(cider);

        beer.throwDrink();
        System.out.println();
        beerBomb.throwDrink();



        System.out.println();
        System.out.println("Drinks without container");
        System.out.println("-------------------------");
        beer.serve();
        cider.serve();
        System.out.println("-------------------------");


        System.out.println();

        System.out.println("Drinks with can container");
        System.out.println("------------------------");
        cannedBeer.serve();
        cannedCider.serve();
        System.out.println("-------------------------");


        System.out.println();
        System.out.println("Drinks with glass container");
        glassBeer.serve();
        glassCider.serve();
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("Drinks with draft container");
        System.out.println("-------------------------");
        draftBeer.serve();
        draftCider.serve();
        System.out.println("-------------------------");
    }
}
