package streaming.factory_method;

public abstract class FruitFactory {

    public void doStuff() {
        Fruit fruit = createFruit();
        /*
         * Just trying if it is able to check specific Fruit istance.
         * Probably should be a method implemented in the specific factory then (?)
         */
        if (fruit instanceof Banana) {
            System.out.println("Nice, Banana has been created");
        }
        if (fruit instanceof Apple) {
            System.out.println("Nice, apple has been created");
        }
        System.out.println("Time to test our new fruit");
        fruit.eat();
    }

    abstract Fruit createFruit();

}
