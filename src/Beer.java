public class Beer implements Drink{

    @Override
    public void serve() {
        System.out.println("DRINK: Beer");
    }

    @Override
    public void throwDrink() {
        System.out.println("THROWING....");
    }
}
