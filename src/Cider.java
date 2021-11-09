public class Cider implements Drink {

    @Override
    public void serve() {
        System.out.println("DRINK: Cider");
    }

    @Override
    public void throwDrink() {
        System.out.println("THROWING....");
    }
}
