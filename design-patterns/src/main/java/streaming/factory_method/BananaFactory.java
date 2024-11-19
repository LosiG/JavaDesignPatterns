package streaming.factory_method;

public class BananaFactory extends FruitFactory {

    public Banana createFruit() {
        return new Banana();
    }
}
