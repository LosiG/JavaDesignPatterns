package streaming.factory_method;

public class AppleFactory extends FruitFactory {

    public Apple createFruit() {
        return new Apple();
    }

}
